package hw_4.task_1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sentence = new StringBuilder();
        String conservation;

        System.out.println("To finish entering words, type the word STOP:");

        while (true) {
            conservation = scanner.nextLine();

            if (conservation.equalsIgnoreCase("STOP")) {
                break;
            }
            sentence.append(conservation);
            sentence.append(" ");
        }
        System.out.println("Your sentence: " + sentence.toString().trim());

        scanner.close();
    }
}
