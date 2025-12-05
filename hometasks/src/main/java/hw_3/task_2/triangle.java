package hw_3.task_2;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть довжину першої сторони: ");
        int a = scanner.nextInt();

        System.out.println("Введіть довжину другої сторони: ");
        int b = scanner.nextInt();

        System.out.println("Введіть довжину третьої сторони: ");
        int c = scanner.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("З цих сторін можна побудувати трикутник");
        } else {
            System.out.println("З цих сторін не можна побудувати трикутник");
        }
        scanner.close();
    }
}
