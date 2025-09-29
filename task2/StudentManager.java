package task2;

import java.util.ArrayList; // Use ArrayList to store student objects
import java.util.Scanner;

public class StudentManager {
    private static ArrayList<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            displayMenu();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\n--- Student Record Management System ---");
        System.out.println("1. Add a new student");
        System.out.println("2. View all students");
        System.out.println("3. Update a student record");
        System.out.println("4. Delete a student record");
        System.out.println("5. Exit");
        System.out.println("----------------------------------------");
    }

    private static void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Student Marks: ");
        double marks = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        studentList.add(new Student(id, name, marks));
        System.out.println("Student added successfully!");
    }

    private static void viewStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No student records found.");
        } else {
            System.out.println("\n--- Student Records ---");
            for (Student student : studentList) {
                System.out.println(student);
            }
        }
    }

    private static void updateStudent() {
        System.out.print("Enter Student ID to update: ");
        int idToUpdate = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        boolean found = false;
        for (Student student : studentList) {
            if (student.getId() == idToUpdate) {
                System.out.print("Enter new Name: ");
                String newName = scanner.nextLine();
                student.setName(newName);

                System.out.print("Enter new Marks: ");
                double newMarks = scanner.nextDouble();
                student.setMarks(newMarks);
                scanner.nextLine(); // Consume newline

                System.out.println("Student record updated successfully!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with ID " + idToUpdate + " not found.");
        }
    }

    private static void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        int idToDelete = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        boolean found = false;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == idToDelete) {
                studentList.remove(i);
                System.out.println("Student record deleted successfully!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with ID " + idToDelete + " not found.");
        }
    }
}
