package hw_4.task_4;

import java.util.Scanner;

public class SecondOption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = {"Petya", "Masha", "Olena", "Fedya", "Sasha", "Anton", "Glib"};
        System.out.println("Please enter the first number between 0 and 6: ");
        int namesIndex = scanner.nextInt();
        System.out.println(names[namesIndex]);

        int[] numbers = {10, 12, 14, 16, 18, 20};
        System.out.println("Please enter the second number between 0 and 5: ");
        int numbersIndex = scanner.nextInt();
        System.out.println(numbers[numbersIndex]);

        String[] establishments = {"school", "store", "church", "gym", "cinema", "clinic"};
        System.out.println("Please enter the third number between 0 and 5: ");
        int establishmentsIndex = scanner.nextInt();
        System.out.println(establishments[establishmentsIndex]);

        System.out.println(names[namesIndex] + " will go to " + establishments[establishmentsIndex] + " about " + numbers[numbersIndex]);

        scanner.close();
    }
}
