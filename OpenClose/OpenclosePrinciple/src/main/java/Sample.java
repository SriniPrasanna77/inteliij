import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Engine {
    public String toString() { return getClass().getName() + ": " + hashCode();}

    public Engine() {}

    protected Engine(Engine theEngine) {} // client class cannot call it directly

    public Engine copy() {
        //use reflection here to make a copy
        if (getClass().getName() == "PistonEngine")
            return new PistonEngine((PistonEngine) this);

        if (getClass().getName() == "TurboEngine")
            return new TurboEngine((TurboEngine) this);

        return new Engine(this);
    }
}

class TurboEngine extends Engine {
    public TurboEngine() {super();}
    public TurboEngine(TurboEngine otherEngine) {super(otherEngine);}

}

class PistonEngine extends Engine {
    public PistonEngine() {super();}
    public PistonEngine(PistonEngine otherEngine) {super(otherEngine);}
//    public Engine copy() {
//        return new PistonEngine(this);
//    }
}

class Car {
    private int year;
    private Engine engine;

    public Car(int theYear, Engine theEngine) {
        year = theYear;
        engine = theEngine;
    }

    public Car(Car otherCar) {
        year = otherCar.year;
        // new is not polymorphic in Java. So it will still create an object of Engine
        // To resolve, this a quick option is
        /*
        if (otherCar.engine instanceof TurboEngine) {
            engine = new TurboEngine((TurboEngine) otherCar.engine);
        } else {
            engine = new Engine(otherCar.engine);
        }
         */
        // here, for every new type of engine, the Car constructor has to be changed. TIGHT COUPLING!!!
        // NO COHESION
        // So to solve this problem, we can create a "copy" method in Engine and also make the Engine's copy constructor inaccessible to client class
        // by making it 'protected'

        engine = otherCar.engine.copy();
    }


    public String toString() {
        return year + " - " + engine;
    }
}

public class Sample {

    public static void main(String[] args) {
        Car car1 = new Car(2015, new PistonEngine());
        System.out.println(car1);

        Car car2 = new Car(car1);
        System.out.println(car2);
    }

}
