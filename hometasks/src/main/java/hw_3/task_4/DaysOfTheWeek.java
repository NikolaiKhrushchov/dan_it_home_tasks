package hw_3.task_4;

import java.util.Scanner;

public class DaysOfTheWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int numbers = scanner.nextInt();

        if(numbers == 1) {
            System.out.println("Monday");
        } else if (numbers == 2) {
            System.out.println("Tuesday");
        } else if (numbers == 3) {
            System.out.println("Wednesday");
        } else if (numbers == 4) {
            System.out.println("Thursday");
        } else if (numbers == 5) {
            System.out.println("Friday");
        } else if (numbers == 6) {
            System.out.println("Saturday");
        } else if (numbers == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("It would be better if today was Friday");
        }
        scanner.close();
    }
}
