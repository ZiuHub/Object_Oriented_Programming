import java.util.*;

public class Customer {
    // Attribute
    List <Dish> orders = new ArrayList<>();
    private String name;

    // Constructor
    // Setter
    Customer(String name){
        this.name = name;
    }

    // Getter
    String getName(){
        return name;
    }

    void displayOrders(){
        System.out.println(name + "'s Orders:");
        for(Dish dish : orders){
            dish.printDish();
        }
    }
}