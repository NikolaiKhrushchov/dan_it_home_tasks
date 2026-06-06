package hw_7.task_2;

import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        Student.addStudent(students, new Student(1, "Igor", 20, 7));
        Student.addStudent(students, new Student(2, "Anton", 18, 8.9));
        Student.addStudent(students, new Student(3, "Anna", 19, 7.4));
        Student.addStudent(students, new Student(4, "Stepan", 17, 10));
        Student.addStudent(students, new Student(5, "Sergiy", 21, 9.2));

        System.out.println("Full list of students");
        System.out.println(students);

        System.out.println("\nWe remove the student with ID 4");
        Student.removeStudentById(students, 4);
        Student.printAllStudents(students);

        System.out.println("\nSearch for a student Anton");
        Student found = Student.findStudentByName(students, " Anton ");
        if (found != null) {
            System.out.println("Student found" + found);
        }
        System.out.println("\nSearch for a student Ivan who is not here");
        Student.findStudentByName(students, " Ivan ");
    }
}
