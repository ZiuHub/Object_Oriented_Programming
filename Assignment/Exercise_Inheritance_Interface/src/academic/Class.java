package academic;

import actor.Lecturer;
import actor.Student;
import java.util.ArrayList;

public class Class {
    private String classCode;
    private int semester;
    private String year;

    private ArrayList<Course> courses = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Lecturer> lecturers = new ArrayList<>();

    public Class(String classCode, int semester, String year) {
        this.classCode = classCode;
        this.semester = semester;
        this.year = year;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addLecturer(Lecturer lecturer, Course course) {
        lecturers.add(lecturer);
        lecturer.addCourse(course);
    }

    public void attend(IAttendant a) {
        a.attend();
    }

    public void takeAttendance(IAttendee a) {
        a.takeAttendance();
    }

    public void showTodayAttendance() {
        System.out.println("=== Today's Attendance ===");
        for (Student s : students) {
            System.out.println("✓ " + s.getName());
        }
        for (Lecturer l : lecturers) {
            System.out.println("✓ " + l.getName() + " (Lecturer)");
        }
    }
}