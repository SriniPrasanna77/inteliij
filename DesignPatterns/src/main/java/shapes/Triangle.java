package shapes;

public class Triangle extends Shapes {

    int centerX;
    int centerY;

    public Triangle(int x, int y) {
        this.centerX = x;
        this.centerY = y;
    }

    @Override
    public void display() {
        System.out.println("Triangle displayed = " + this.centerX + ", " + this.centerY);
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
