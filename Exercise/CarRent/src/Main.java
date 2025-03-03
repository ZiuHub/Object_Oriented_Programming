public class Main {
    public Main() {
        Car car1 = new Car("Toyota Corolla", "Sedan", "B 1234 AB");
        Car car2 = new Car("Honda Civic", "Sedan", "D 5678 CD");

        RentalService rentalService = new RentalService();
        rentalService.addCar(car1);
        rentalService.addCar(car2);

        Customer customer = new Customer("Michael");

        rentalService.rentCar(customer, car1);
        rentalService.rentCar(customer, car2);

        customer.displayRentedCars();

        rentalService.returnCar(customer, car1);

        customer.displayRentedCars();

        rentalService.displayAvailableCars();
    }

    public static void main(String[] args) {
        new Main();
    }
}

/*
Car added to rental service: Toyota Corolla
Car added to rental service: Honda Civic
Michael rented: Toyota Corolla
Michael rented: Honda Civic
Michael's Rented Cars:
Model: Toyota Corolla
Type: Sedan
License Plate: B 1234 AB
------------------------
Model: Honda Civic
Type: Sedan
License Plate: D 5678 CD
------------------------
Michael returned: Toyota Corolla
Michael's Rented Cars:
Model: Honda Civic
Type: Sedan
License Plate: D 5678 CD
------------------------
Available Cars in Rental Service:
Model: Toyota Corolla
Type: Sedan
License Plate: B 1234 AB
------------------------
 */