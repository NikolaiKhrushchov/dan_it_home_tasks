package hw_4.task_2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        String numeric = scanner.nextLine();

        String reversed = new StringBuilder(numeric).reverse().toString();

        if (numeric.equals(reversed)) {
            System.out.println("This number is a palindrome: ");
        } else {
            System.out.println("This number is not a palindrome: ");
        }
        scanner.close();
    }
}
