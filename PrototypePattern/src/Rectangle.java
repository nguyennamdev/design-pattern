public class Rectangle extends Shape {

    @Override
    void draw() {
        System.out.println("drawing rectangle shape");
    }

    public Rectangle() {
        type = "Rectangle";
    }

}
