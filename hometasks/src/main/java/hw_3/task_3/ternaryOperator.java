package hw_3.task_3;

import java.util.Scanner;

public class ternaryOperator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("введіть перше число");
        int a = scanner.nextInt();

        System.out.println("введіть друге число");
        int b = scanner.nextInt();

        int c = (a > b) ? (a - b) : (b - a);
        System.out.println("різниця двох чисел = " + c);

        scanner.close();
    }
}
