public class Square extends Shape {

    @Override
    void draw() {
        System.out.println("drawing square shape");
    }

    public Square() {
        type = "Square";
    }

}
