package shapes;

public class Circle extends Shapes {

    int centerX;
    int centerY;

    public Circle(int x, int y) {
        this.centerX = x;
        this.centerY = y;
    }
    @Override
    public void display() {
        System.out.println("Circle displayed = " + this.centerX + ", " + this.centerY);
    }

    @Override
    public int getX() {
        return this.centerX;
    }

    @Override
    public int getY() {
        return this.centerY;
    }
}
