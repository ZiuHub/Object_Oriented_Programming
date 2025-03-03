public class Main {
    public Main() {
        Flight flight1 = new Flight("GA100", "Jakarta", "Bali", 5);
        Flight flight2 = new Flight("SQ200", "Singapore", "Tokyo", 3);

        Airline airline = new Airline("Garuda Indonesia");
        airline.addFlight(flight1);
        airline.addFlight(flight2);

        Passenger passenger = new Passenger("Jonathan");

        airline.bookFlight(passenger, flight1);
        airline.bookFlight(passenger, flight2);
        airline.bookFlight(passenger, flight2); // Trying to book again should show an error if full

        passenger.displayBookedFlights();

        airline.cancelBooking(passenger, flight1);

        passenger.displayBookedFlights();

        airline.displayAvailableSeats();
    }

    public static void main(String[] args) {
        new Main();
    }
}

/*
Flight added to airline: GA100 (Jakarta → Bali)
Flight added to airline: SQ200 (Singapore → Tokyo)
Jonathan booked flight: GA100 (Jakarta → Bali)
Jonathan booked flight: SQ200 (Singapore → Tokyo)
Jonathan's Booked Flights:
Flight Number: GA100
Route: Jakarta → Bali
------------------------
Flight Number: SQ200
Route: Singapore → Tokyo
------------------------
Jonathan canceled booking: GA100 (Jakarta → Bali)
Jonathan's Booked Flights:
Flight Number: SQ200
Route: Singapore → Tokyo
------------------------
Available Seats:
GA100 (Jakarta → Bali) - Available Seats: 5
SQ200 (Singapore → Tokyo) - Available Seats: 2
 */