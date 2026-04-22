package hw_7.task_2;

import java.util.List;

public class StudentHandler {
    public List<Student> addStudent(List<Student> students, Student student) {
        students.add(student);
        return students;
    }

    public List<Student> removeStudentById(List<Student> students, int id) {
        for (int i = students.size() - 1; i >= 0; i--) {
            if (students.get(i).getId() == id) {
                students.remove(i);
            }
        }
        return students;
    }

    public Student findStudentByName(List<Student> students, String name) {
        Student student = null;
        for (Student studentEntity : students) {
            if (studentEntity.getName().equals(name)) {
                student = studentEntity;
            }
        }
        if (student == null) {
            System.out.println("Student with name" + name + "not found");
        }
        return student;
    }

    public void printAllStudents(List<Student> students) {
        for (Student allStudents : students) {
            System.out.println("Student: " + allStudents.getName());
        }
    }
}
