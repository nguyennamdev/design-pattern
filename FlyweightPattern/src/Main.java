public class Main {

    public static void main(String[] args) {
        Circle circle = (Circle) ShapeFactory.getCircle("Red");
        circle.setRadius(100);
        circle.setX(0);
        circle.setY(0);
        circle.draw();
        System.out.println(circle);

        Circle circle2 = (Circle) ShapeFactory.getCircle("Red");
        circle2.draw();
        circle2.setY(10);
        circle2.setX(10);
        circle2.setRadius(200);
        System.out.println(circle2);

        circle.draw();
    }

}
