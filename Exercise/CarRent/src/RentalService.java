import java.util.*;

public class RentalService {
    List <Car> availableCars = new ArrayList<>();

    void addCar(Car car){
        System.out.println("Car added to rental service: " + car.getModel());
        availableCars.add(car);
    }

    void rentCar(Customer customer, Car car){
        System.out.println("Michael rented: " + car.getModel());
        availableCars.remove(car);
        customer.rentedCars.add(car);
    }

    void returnCar(Customer customer, Car car){
        System.out.println("Michael returned: " + car.getModel());
        customer.rentedCars.remove(car);
        availableCars.add(car);
    }

    void displayAvailableCars(){
        System.out.println("Available Cars in Rental Service:");
        for(Car car : availableCars){
            car.displayCars();
        }
    }
}
