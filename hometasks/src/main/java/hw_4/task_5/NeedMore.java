package hw_4.task_5;

import java.util.Scanner;

public class NeedMore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[30];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 41);
        }
        System.out.println("Enter a number to search: ");
        int number = scanner.nextInt();

        boolean found = false;
        for (int a : array) {
            if (a == number) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("There is such a number in the array");
        } else {
            System.out.println("There is no such number in the array");
        }
        scanner.close();
    }
}
