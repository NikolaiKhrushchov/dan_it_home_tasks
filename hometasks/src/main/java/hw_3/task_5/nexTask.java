package hw_3.task_5;

import java.util.Scanner;

public class nexTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the operator (- , + , % , / , *): ");
        char operator = scanner.next().charAt(0);

        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();

        int result = 0;

        result = (operator == '+') ? (num1 + num2) :
                (operator == '-') ? (num1 - num2) :
                        (operator == '*') ? (num1 * num2) :
                                (operator == '/') ? ((num2 != 0) ? (num1 / num2) : 0) : //
                                        (operator == '%') ? ((num2 != 0) ? (num1 % num2) : 0) :
                                                0;
        System.out.println("Дорівнює: " + result);

        scanner.close();
    }
}
