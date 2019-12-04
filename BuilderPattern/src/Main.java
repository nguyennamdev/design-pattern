public class Main {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        mealBuilder.order1().showItems();
        System.out.println("Total prices " + mealBuilder.order1().getTotalPrice());
    }

}
