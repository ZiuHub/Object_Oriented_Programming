package actor;

import academic.IAttendee;
import academic.Course;

import java.util.ArrayList;

public class Lecturer extends Actor implements IAttendee {
    private String code;
    private ArrayList<Course> courses = new ArrayList<>();

    public Lecturer(String code, String name, String dob) {
        super(name, dob);
        this.code = code;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    @Override
    public void takeAttendance() {
        System.out.println("Lecturer " + name + " is taking attendance.");
    }

    public void showCourse(int semester) {
        System.out.println("Lecturer " + name + " teaches:");
        for (Course c : courses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}