package design_patterns.creational_patterns.factory;

public class Application {

    public static void main(String[] args) {

        OrderProcessingFactory order = new OrderProcessingFactory();

        Order foodOrders = order.createOrder("food");
        foodOrders.addItem("cheese");
        foodOrders.addItem("yogurt");
        foodOrders.getAllItems();

        Order applianceOrders = order.createOrder("appliance");
        applianceOrders.addItem("Washing machine");
        applianceOrders.addItem("Dish washer");
        applianceOrders.getAllItems();

        Order bookOrders = order.createOrder("book");
        bookOrders.addItem("And then there were none - Agatha Christie");
        bookOrders.addItem("The power of habit - Charles Duhigg");
        bookOrders.getAllItems();

    }
}
