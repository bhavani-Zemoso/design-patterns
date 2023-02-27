package design_patterns.creational_patterns.factory;

public class OrderProcessingFactory {

    public Order createOrder(String type) {
        Order newOrder;

        if(type.equalsIgnoreCase("food"))
            return newOrder = new FoodOrder();
        else if(type.equalsIgnoreCase("appliance"))
            return newOrder = new ApplianceOrder();
        else if(type.equalsIgnoreCase("book"))
            //Register the new order type
            return newOrder = new BookOrder();
        else
            throw new IllegalArgumentException("Invalid type " + type);
    }
}
