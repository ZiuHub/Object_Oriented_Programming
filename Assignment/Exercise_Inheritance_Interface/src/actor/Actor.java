package actor;

public class Actor {
    protected String name;
    protected String dob;

    public Actor(String name, String dob) {
        this.name = name;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }
}