package studentmanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class StudentManagementSystem {

    private final List<Student> students;

    public StudentManagementSystem() {
        this.students = new ArrayList<>();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            printMenu();
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    addStudent(scanner);
                    break;
                case "2":
                    searchStudent(scanner);
                    break;
                case "3":
                    listStudents();
                    break;
                case "4":
                    System.out.println("Goodbye!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.\n");
            }
        }
        scanner.close();
    }

    private void printMenu() {
        System.out.println("\n=== Student Management System ===");
        System.out.println("1. Add Student");
        System.out.println("2. Search Student by ID");
        System.out.println("3. List All Students");
        System.out.println("4. Exit");
    }

    private void addStudent(Scanner scanner) {
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine().trim();
        if (id.isEmpty()) {
            System.out.println("Student ID cannot be empty.");
            return;
        }
        if (findStudentById(id).isPresent()) {
            System.out.println("A student with this ID already exists.");
            return;
        }

        System.out.print("Enter Name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Enter Major: ");
        String major = scanner.nextLine().trim();

        Student student = new Student(id, name, major);
        students.add(student);
        System.out.println("Student added successfully.");
    }

    private void searchStudent(Scanner scanner) {
        System.out.print("Enter Student ID to search: ");
        String id = scanner.nextLine().trim();
        Optional<Student> studentOpt = findStudentById(id);
        if (studentOpt.isPresent()) {
            System.out.println("Found: " + studentOpt.get());
        } else {
            System.out.println("Student not found.");
        }
    }

    private Optional<Student> findStudentById(String id) {
        return students.stream()
                .filter(s -> s.getStudentId().equalsIgnoreCase(id))
                .findFirst();
    }

    private void listStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }
        System.out.println("\n--- All Students ---");
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        new StudentManagementSystem().run();
    }
}