public class Main {

    public static void main(String[] args) {
        Circle circleShape = new Circle();
        circleShape.draw();

        RedShapeDecorator rectangleRedShape = new RedShapeDecorator(new Rectangle());
        rectangleRedShape.draw();
    }

}
