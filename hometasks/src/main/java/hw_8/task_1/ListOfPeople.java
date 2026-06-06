package hw_8.task_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ListOfPeople {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Person> personsMap = new HashMap<>();

        while (true) {
            System.out.println("Enter command (Person surname or exit)");
            String surname = scanner.nextLine();

            if (surname.equals("exit")) {
                System.out.println("Goodbye");
                break;
            }
            String key = surname.toUpperCase();

            System.out.println("Enter name: ");
            String name = scanner.nextLine();

            int age = -1;
            while (age < 0) {
                System.out.println("Enter age:");

                if (scanner.hasNextInt()) {
                    age = scanner.nextInt();
                    if (age < 0) {
                        System.out.println("Error! Age cannot be negative");
                    }
                } else {
                    System.out.println("Error! Please enter a number for age");
                }
                scanner.nextLine();
            }
            personsMap.put(key, new Person(name, surname, age));
            System.out.println("Person added successfully");
        }
        scanner.close();
    }
}

