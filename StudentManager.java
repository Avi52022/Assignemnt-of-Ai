import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            System.out.println("Student Records:");
            for (Student student : students) {
                student.displayStudent();
            }
        }
    }

    public double calculateAverageGrade() {
        if (students.isEmpty()) {
            System.out.println("No students available to calculate average.");
            return 0;
        }

        double total = 0;
        for (Student student : students) {
            total += student.getGrade();
        }
        return total / students.size();
    }
}
