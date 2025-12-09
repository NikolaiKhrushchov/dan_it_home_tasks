package hw_3.task_2;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the first side: ");
        int a = scanner.nextInt();

        System.out.println("Enter the length of the second side: ");
        int b = scanner.nextInt();

        System.out.println("Enter the length of the third side: ");
        int c = scanner.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("From these sides you can construct a triangle");
        } else {
            System.out.println("A triangle cannot be constructed from these sides.");
        }
        scanner.close();
    }
}
