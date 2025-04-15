package main.java.com.studentapp;

public class Main {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();

        // Adding a new student
        Student student1 = new Student();
        student1.setName("John Doe");
        student1.setRollNumber("12345");
        student1.setEmail("john.doe@example.com");
        student1.setMobile("9876543210");
        dao.addStudent(student1);

        // Retrieving all students
        System.out.println("All Students:");
        for (Student student : dao.getAllStudents()) {
            System.out.println(student.getId() + " | " + student.getName());
        }
    }
}
