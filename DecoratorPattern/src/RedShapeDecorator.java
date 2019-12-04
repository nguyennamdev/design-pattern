public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
        super.draw();
        setBorderColor(this.decoratorShape);
    }

    private void setBorderColor(Shape decoratorShape) {
        System.out.println(decoratorShape + " did set border color is : Red");
    }

}
