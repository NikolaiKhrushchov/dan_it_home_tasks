package hw_3.task_2;

import java.util.Scanner;

public class IntegerValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first integer value: ");
        int a = scanner.nextInt();

        System.out.println("Enter the second integer value: ");
        int b = scanner.nextInt();

        System.out.println("Enter the third integer value: ");
        int c = scanner.nextInt();

       if(a < b + c && a > b - c && b < a + c && b > a - c && c < a + b && c > a - b) {
           System.out.println("A triangle can be constructed from these segments");
       } else {
           System.out.println("A triangle cannot be constructed from these segments");
       }
       scanner.close();
    }
}
