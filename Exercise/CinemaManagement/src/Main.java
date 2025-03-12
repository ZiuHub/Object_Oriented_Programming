public class Main {
    public static void main(String[] args) {
        Cinema cinema = new Cinema("Grand Theater", "Downtown");

        Employee manager = new Employee("Alice", "Manager");
        Employee cashier = new Employee("Bob", "Cashier");
        cinema.addEmployee(manager);
        cinema.addEmployee(cashier);

        Hall hall1 = new Hall(1, 100);
        Hall hall2 = new Hall(2, 80);
        cinema.addHall(hall1);
        cinema.addHall(hall2);

        Movie movie1 = new Movie("Avengers: Endgame", "Action");
        Movie movie2 = new Movie("Inception", "Sci-Fi");

        Showtime showtime1 = new Showtime("18:00", "2025-03-15", movie1);
        Showtime showtime2 = new Showtime("20:00", "2025-03-15", movie2);
        hall1.addShowtime(showtime1);
        hall2.addShowtime(showtime2);

        Customer customer1 = new Customer("John Doe", 25);
        Ticket ticket1 = new Ticket(101, 10.0, customer1);
        showtime1.addTicket(ticket1);
        customer1.addTicket(ticket1);

        cinema.displayCinemaInfo();
    }
}

/*
Cinema: Grand Theater
Location: Downtown

Employees:
- Name: Alice, Role: Manager
- Name: Bob, Role: Cashier

Halls:
Hall 1 (Capacity: 100)
  Showtimes:
    - Movie: Avengers: Endgame
      Time: 18:00, Date: 2025-03-15
      Tickets:
        * Ticket ID: 101, Price: $10.0, Customer: John Doe, Payment Status: Paid

Hall 2 (Capacity: 80)
  Showtimes:
    - Movie: Inception
      Time: 20:00, Date: 2025-03-15
      Tickets: No tickets booked yet.

Customers:
- Name: John Doe, Age: 25
  Tickets:
    * Ticket ID: 101, Movie: Avengers: Endgame, Showtime: 18:00, Date: 2025-03-15, Price: $10.0, Status: Paid
 */