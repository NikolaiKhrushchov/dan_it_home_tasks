package hw_3.task_5;

import java.util.Scanner;

public class SymbolsAndNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first number: ");
        int a = scanner.nextInt();

        System.out.println("Please enter the second number: ");
        int b = scanner.nextInt();

        System.out.println("Please enter one of the characters(+, -, *, /, %): ");
        char symbol = scanner.next().charAt(0);

        int result = (symbol == '+') ? (a + b) :
                (symbol == '-') ? (a - b) :
                        (symbol == '*') ? (a * b) :
                                (symbol == '/') ? (b != 0 ? a / b : 0) :
                                        (symbol == '%') ? (b != 0 ? a % b : 0) : 0;

        System.out.println("Respond: " + result);

        scanner.close();
    }
}
