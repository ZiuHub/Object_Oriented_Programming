import java.util.*;

public class Customer {
    List <Car> rentedCars = new ArrayList<>();
    private String name;

    Customer(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }
    
    void displayRentedCars(){
        System.out.println(getName() + "'s Rented Cars:");
        for(Car car : rentedCars){
            car.displayCars();
        }
    }
}