package studentManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
	
	private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    public Student searchStudentByRollNo(int rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                return student;
            }
        }
        return null;
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            for (Student student : students) {
                student.displayDetails();
            }
        }
    }

    public void inputStudentDetails(Scanner scanner) {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter roll number: ");
        int roll = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter course: ");
        String course = scanner.nextLine();
        System.out.print("Enter marks: ");
        int marks = Integer.parseInt(scanner.nextLine());

        Student newStudent = new Student(name, roll, course, marks);
        addStudent(newStudent);
    }
}
