package design_patterns.creational_patterns.factory;

import java.util.ArrayList;
import java.util.List;

public class ApplianceOrder implements Order {

    List<String> applianceItems;
    final double GST = 20.8;

    public ApplianceOrder() {
        applianceItems = new ArrayList<>();
    }
    @Override
    public void addItem(String item) {
        applianceItems.add(item);
        process();
    }

    @Override
    public void deleteItem(String item) {
        applianceItems.remove(item);
        process();
    }
    @Override
    public void process() {
        double amount = 12000 * applianceItems.size();
        double totalAmount = (GST * amount / 100) + amount;
        System.out.println("Total amount for appliance order: " + totalAmount);
    }

    @Override
    public void getAllItems() {
        System.out.println("Appliance List: ");

        for(String appliance: applianceItems)
            System.out.println(appliance);
    }
}
