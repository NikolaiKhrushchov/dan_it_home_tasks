package hw_3.task_3;

import java.util.Scanner;

public class ternaryOperator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the first number");
        int a = scanner.nextInt();

        System.out.println("enter the second number");
        int b = scanner.nextInt();

        int c = (a > b) ? (a - b) : (b - a);
        System.out.println("the difference of two numbers = " + c);

        scanner.close();
    }
}
