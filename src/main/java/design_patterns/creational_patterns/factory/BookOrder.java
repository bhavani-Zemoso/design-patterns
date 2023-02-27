package design_patterns.creational_patterns.factory;

import java.util.ArrayList;
import java.util.List;

/*
A new order type can be created without violating the open closed principle
Any extensions to the order type will be made in the new child class and none of the parent classes or other classes will be modified
 */
public class BookOrder implements Order{
    List<String> bookItems;
    final double GST = 2.5;

    public BookOrder() {
        bookItems = new ArrayList<>();
    }
    @Override
    public void addItem(String item) {
        bookItems.add(item);
        process();
    }

    @Override
    public void deleteItem(String item) {
        bookItems.remove(item);
        process();
    }
    @Override
    public void process() {
        double amount = 500 * bookItems.size();
        double totalAmount = (GST * amount / 100) + amount;
        System.out.println("Total amount for book order: " + totalAmount);
    }

    @Override
    public void getAllItems() {
        System.out.println("Book List: ");

        for(String book: bookItems)
            System.out.println(book);
    }
}
