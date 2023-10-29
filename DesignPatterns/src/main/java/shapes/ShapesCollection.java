package shapes;

public class ShapesCollection {
    private Shapes[] shapesArray;

    public ShapesCollection(Shapes[] shapes) {
        shapesArray = shapes.clone();
    }

    public void display() {
        for (Shapes shape : shapesArray) {
            shape.display();
        }
    }

    public void sort() {

    }
}
