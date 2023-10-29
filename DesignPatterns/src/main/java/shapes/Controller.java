package shapes;

public class Controller {

    public static void main(String[] args) {
        ShapeDataBase shapeDataBase = new ShapeDataBase();
        ShapesCollection shapesCollection = shapeDataBase.getCollection();
        shapesCollection.display();
    }
}
