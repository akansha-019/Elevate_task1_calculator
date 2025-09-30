package task2;

public class Student {
    private int id;
    private String name;
    private double marks;

    // Constructor to initialize a new Student object
    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Getter methods to access private fields
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    // Setter methods to modify private fields
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student ID: " + id + ", Name: " + name + ", Marks: " + marks;
    }
}