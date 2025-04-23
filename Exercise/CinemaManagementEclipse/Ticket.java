public class Ticket {
    private int id;
    private double price;
    private boolean paymentStatus = true;
    private Customer customer;

    public Ticket(int id, double price, Customer customer){
        this.id = id;
        this.price = price;
        this.customer = customer;
    }

    public int getId(){
        return id;
    }

    public double getPrice(){
        return price;
    }

    public String getPaymentStatus(){
        return paymentStatus ? "Paid" : "Not Paid";
    }

    public Customer getCustomer(){
        return customer;
    }
}