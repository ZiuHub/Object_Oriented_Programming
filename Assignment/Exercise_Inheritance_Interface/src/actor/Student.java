package actor;

import academic.IAttendant;

public class Student extends Actor implements IAttendant {
    private String nim;

    public Student(String nim, String name, String dob) {
        super(name, dob);
        this.nim = nim;
    }

    @Override
    public void attend() {
        System.out.println("Student " + name + " is attending.");
    }

    public void showCredits(int semester) {
        System.out.println(name + " is taking 2 credits in semester " + semester);
    }
}