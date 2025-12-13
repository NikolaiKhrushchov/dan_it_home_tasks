package hw_4.task_2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number");
        String numberRow = scanner.nextLine();

        StringBuilder reversedString = new StringBuilder(numberRow).reverse();

        if (numberRow.equals(reversedString.toString())) {
            System.out.println("Number" + numberRow + "This is a palindrome");
        } else {
            System.out.println("Number" + numberRow + "This is not a palindrom");
        }
        scanner.close();
    }
}
