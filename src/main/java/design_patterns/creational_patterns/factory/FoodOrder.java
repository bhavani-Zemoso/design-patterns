package design_patterns.creational_patterns.factory;

import java.util.ArrayList;
import java.util.List;

public class FoodOrder implements Order {

    List<String> foodItems;
    final double GST = 6.5;

    public FoodOrder() {
        foodItems = new ArrayList<>();
    }
    @Override
    public void addItem(String item) {
        foodItems.add(item);
        process();
    }

    @Override
    public void deleteItem(String item) {
        foodItems.remove(item);
        process();
    }
    @Override
    public void process() {
        double amount = 200 * foodItems.size();
        double totalAmount = (GST * amount / 100) + amount;
        System.out.println("Total amount for food order: " + totalAmount);
    }

    @Override
    public void getAllItems() {
        System.out.println("Food List: ");

        for(String food: foodItems)
            System.out.println(food);
    }
}
