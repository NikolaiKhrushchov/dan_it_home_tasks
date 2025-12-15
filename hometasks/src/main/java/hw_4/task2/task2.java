package hw_4.task2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number:");
        int originalNumber = scanner.nextInt();
        scanner.close();

        if (isPalindrome(originalNumber)) {
            System.out.println("Numeric " + originalNumber + "is a palindrome .");
        } else {
            System.out.println("Numeric " + originalNumber + "is not a palindrome .");
        }
    }

    public static boolean isPalindrome(int number) {
        int original = number;
        int reversed = 0;
        int remainder;

        while (number != 0) {
            remainder = number % 10;
            reversed = reversed * 10 + remainder;
            number /= 10;
        }

        return original == reversed;
    }
}
