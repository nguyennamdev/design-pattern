public class MealBuilder {

    public Meal order1() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        meal.addItem(new ChickenBurger());
        return meal;
    }

    public Meal order2() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Cocacola());
        meal.addItem(new VegBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

}
