package shapes;

public class ShapeDataBase {

    ShapesCollection shapesCollection;
    Shapes[] shapes = new Shapes[3];

    public ShapeDataBase() {
        shapes[0] = new Square(10,10);
        shapes[1] = new Circle(20,20);
        shapes[2] = new Triangle(30,30);

        shapesCollection = new ShapesCollection(shapes);
    }
    public ShapesCollection getCollection() {
        return shapesCollection;
    }
}
