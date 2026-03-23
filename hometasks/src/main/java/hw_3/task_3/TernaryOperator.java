package hw_3.task_3;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first number: ");
        int a = scanner.nextInt();

        System.out.println("Please enter the second number: ");
        int b = scanner.nextInt();

        int result =  a > b ? a - b : b - a;
        System.out.println("Respond: " + result);

        scanner.close();
    }
}
