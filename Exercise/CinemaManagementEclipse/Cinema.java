import java.util.*;

public class Cinema {
    private String name;
    private String location;
    private List<Hall> halls = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();

    public Cinema(String name, String location){
        this.name = name;
        this.location = location;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void addHall(Hall hall){
        halls.add(hall);
    }

    public void displayCinemaInfo(){
        System.out.println("Cinema: " + name);
        System.out.println("Location: " + location);
        
        System.out.println("\nEmployees:");
        for(Employee employee: employees){
            System.out.println("- Name: " + employee.getName() + ", Role: " + employee.getRole());
        }

        System.out.println("\nHalls:");
        for(Hall hall: halls){
            System.out.println("Hall " + hall.getHallNumber() + " (Capacity: " + hall.getCapacity() + ")");
            System.out.println("  Showtimes:");
            for(Showtime showtime: hall.getShowtimes()){
                System.out.println("    - Movie: " + showtime.getMovie().getTitle());
                System.out.println("      Time: " + showtime.getTime() + ", Date: " + showtime.getDate());
                if(showtime.getTickets().isEmpty()){
                    System.out.println("      Tickets: No tickets booked yet.");
                } else {
                    System.out.println("      Tickets:");
                    for(Ticket ticket: showtime.getTickets()){
                        System.out.println("        * Ticket ID: " + ticket.getId() + 
                                           ", Price: $" + ticket.getPrice() + 
                                           ", Customer: " + ticket.getCustomer().getName() + 
                                           ", Payment Status: " + ticket.getPaymentStatus());
                    }
                }
            }
        }

        System.out.println("\nCustomers:");
        for(Hall hall: halls){
            for(Showtime showtime: hall.getShowtimes()){
                for(Ticket ticket: showtime.getTickets()){
                    System.out.println("- Name: " + ticket.getCustomer().getName() + ", Age: " + ticket.getCustomer().getAge());
                    System.out.println("  Tickets:");
                    System.out.println("    * Ticket ID: " + ticket.getId() + 
                                       ", Movie: " + showtime.getMovie().getTitle() + 
                                       ", Showtime: " + showtime.getTime() + 
                                       ", Date: " + showtime.getDate() + 
                                       ", Price: $" + ticket.getPrice() + 
                                       ", Status: " + ticket.getPaymentStatus());
                }
            }
        }
    }
}