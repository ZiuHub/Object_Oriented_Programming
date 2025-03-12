import java.util.*;

public class Customer {
    private String name;
    private int age;
    private List<Ticket> tickets = new ArrayList<>();

    public Customer(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void addTicket(Ticket ticket){
        tickets.add(ticket);
    }

    public List<Ticket> getTickets(){
        return tickets;
    }
}