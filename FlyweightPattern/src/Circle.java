public class Circle implements Shape {

    private String color;
    private double x;
    private double y;
    private double radius;

    public Circle(String color, double x, double y, double radius) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(String color) {
        this.color = color;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle is drawing: " + color + " at x: " + x + " , y: " + y + ", radius: " + radius);
    }
}
