public class Main {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape shape1 = ShapeCache.getShape("1");
        System.out.println(shape1.getType());

        Shape shape2 = ShapeCache.getShape("2");
        System.out.println(shape2.getType());

    }
}
