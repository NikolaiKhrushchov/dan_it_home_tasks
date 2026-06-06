package hw_4.task_1;

import java.util.Scanner;

public class GluingWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = "";

        System.out.println("Please enter words, to finish enter the word STOP:");

        while (true) {
            String word = scanner.next();
            if (word.equalsIgnoreCase("STOP")) {
                break;
            }
           sentence = sentence + word + " ";
        }
        System.out.println(sentence);

        scanner.close();
    }
}
