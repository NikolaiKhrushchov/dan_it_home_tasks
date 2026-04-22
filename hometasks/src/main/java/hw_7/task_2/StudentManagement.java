package hw_7.task_2;

import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        StudentHandler handler = new StudentHandler();

        handler.addStudent(students, new Student(1, "Igor", 20, 7));
        handler.addStudent(students, new Student(2, "Anton", 18, 8.9));
        handler.addStudent(students, new Student(3, "Anna", 19, 7.4));
        handler.addStudent(students, new Student(4, "Stepan", 17, 10));
        handler.addStudent(students, new Student(5, "Sergiy", 21, 9.2));

        handler.printAllStudents(students);
    }
}
