import java.util.*;

public class Showtime {
    private String time;
    private String date;
    private Movie movie;
    private List<Ticket> tickets = new ArrayList<>();

    public Showtime(String time, String date, Movie movie){
        this.time = time;
        this.date = date;
        this.movie = movie;
    }

    public String getTime(){
        return time;
    }

    public String getDate(){
        return date;
    }

    public Movie getMovie(){
        return movie;
    }

    public void addTicket(Ticket ticket){
        tickets.add(ticket);
    }

    public List<Ticket> getTickets(){
        return tickets;
    }
}