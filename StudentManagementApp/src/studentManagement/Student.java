package studentManagement;

public class Student {
	
	private String name;
    private int rollNumber;
    private String course;
    private int marks;

    public Student(String name, int rollNumber, String course, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.course = course;
        this.marks = marks;
    }

    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Roll Number: " + this.rollNumber);
        System.out.println("Course: " + this.course);
        System.out.println("Marks: " + this.marks);
        System.out.println("-------------------------");
    }
    
    public void updateMarks(int newMarks) {
        this.marks = newMarks;
    }

    public int getRollNumber() {
        return this.rollNumber;
    }

}
