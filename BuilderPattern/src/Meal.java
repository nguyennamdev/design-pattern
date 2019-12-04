import java.util.ArrayList;
import java.util.List;

public class Meal {

    List<Item> meal = new ArrayList<Item>();

    public void addItem(Item item) {
        meal.add(item);
    }

    public double getTotalPrice() {
        Double total = 0.0;
        for (Item m: meal) {
            total += m.price();
        }
        return total;
    }

    public void showItems() {
        System.out.println("----------------");
        for (int i = 0; i < meal.size(); i++) {
            System.out.println("Item " + i);
            System.out.println("- Name - " + meal.get(i).name());
            System.out.println("- Price - " + meal.get(i).price());
            System.out.println("- Packing - " + meal.get(i).packing());
        }
    }

}
