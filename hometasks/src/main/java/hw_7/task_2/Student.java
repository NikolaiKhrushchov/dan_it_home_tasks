package hw_7.task_2;

import java.util.List;

public class Student {

    private int id;
    private String name;
    private int age;
    private double gpa;

    public Student(int id, String name, int age, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                '}';
    }

    public static void addStudent(List<Student> students, Student student) {
        students.add(student);
    }

    public static List<Student> removeStudentById(List<Student> students, int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                break;
            }
        }
        return students;
    }

    public static  Student findStudentByName(List<Student> students, String name) {
        for (Student comparison : students) {
            if (comparison.getName().equals(name)) {
                return comparison;
            }
        }
        System.out.println("Student with name" + name + "not found");
        return null;
    }

    public static void printAllStudents(List<Student> students) {
        for (Student comparison : students) {
            System.out.println(comparison);
        }
    }
}
