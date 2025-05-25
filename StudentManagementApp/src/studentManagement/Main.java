package studentManagement;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n==== Student Management System ====");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student by Roll Number");
            System.out.println("3. Display All Students");
            System.out.println("4. Update Student Marks");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    manager.inputStudentDetails(scanner);
                    break;
                case 2:
                    System.out.print("Enter roll number to search: ");
                    int roll = Integer.parseInt(scanner.nextLine());
                    Student found = manager.searchStudentByRollNo(roll);
                    if (found != null) {
                        found.displayDetails();
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 3:
                    manager.displayAllStudents();
                    break;
                case 4:
                    System.out.print("Enter roll number to update marks: ");
                    int rollToUpdate = Integer.parseInt(scanner.nextLine());
                    Student s = manager.searchStudentByRollNo(rollToUpdate);
                    if (s != null) {
                        System.out.print("Enter new marks: ");
                        int newMarks = Integer.parseInt(scanner.nextLine());
                        s.updateMarks(newMarks);
                        System.out.println("Marks updated.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        scanner.close();
        System.out.println("Application exited.");
    }
}
