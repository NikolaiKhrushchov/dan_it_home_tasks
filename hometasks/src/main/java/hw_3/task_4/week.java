package hw_3.task_4;

import java.util.Scanner;

public class week {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть число від 1 до 7:");

        int dayNumber = scanner.nextInt();

        if (dayNumber == 1) {
            System.out.println("Понеділок");
        } else if (dayNumber == 2) {
            System.out.println("Вівторок");
        } else if (dayNumber == 3) {
            System.out.println("Середа");
        } else if (dayNumber == 4) {
            System.out.println("Четвер");
        } else if (dayNumber == 5) {
            System.out.println("П'ятниця");
        } else if (dayNumber == 6) {
            System.out.println("Субота");
        } else if (dayNumber == 7) {
            System.out.println("Неділя");
        } else {
            System.out.println("Краще б сьогодні була п'ятниця");
        }
    }
}
