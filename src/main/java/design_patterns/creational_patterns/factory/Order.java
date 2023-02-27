package design_patterns.creational_patterns.factory;

public interface Order {

    void process();
    void addItem(String item);
    void deleteItem(String item);
    void getAllItems();
}
