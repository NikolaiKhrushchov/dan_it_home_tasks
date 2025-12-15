package hw_4.task1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sentenceBuilder = new StringBuilder();
        String word;

        System.out.println("Please enter words (to finish, enter STOP):");

        while (true) {
            word = scanner.next();
            if (word.equals("STOP")) {
                break;
            }

            sentenceBuilder.append(word).append(" ");
        }

        scanner.close();

        String finalSentence = sentenceBuilder.toString().trim();

        System.out.println("\nThe resulting sentence:");
        System.out.println(finalSentence);
    }
}
