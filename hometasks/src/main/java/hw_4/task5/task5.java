package hw_4.task5;

import java.util.Random;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        int[] array = new int[10];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.print("Created array: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter the number to search for: ");
        int searchNumber;
        try {
            searchNumber = scanner.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Input error. Please enter only integers.");
            scanner.close();
            return;
        }

        boolean found = false;
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchNumber) {
                found = true;
                index = i;
                break;
            }
        }

        System.out.println("\n");
        if (found) {
            System.out.println("Numeric  " + searchNumber + " found in the array ");
        } else {
            System.out.println("Numeric " + searchNumber + " not found in array ");
        }

        scanner.close();
    }
}
