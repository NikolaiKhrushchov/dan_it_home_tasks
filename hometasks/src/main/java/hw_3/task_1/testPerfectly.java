package hw_3.task_1;

import java.util.Scanner;
import java.io.ByteArrayInputStream;

public class testPerfectly {
    public static void main(String[] args) {
        String newString = "Я тестую чудово. Що ще потрібно?";
        System.out.println(newString);

        Scanner scanner = new Scanner(new ByteArrayInputStream(newString.getBytes()));

        String string1 = scanner.next();
        String string2 = scanner.next();
        String string3 = scanner.next();

        scanner.useDelimiter("\\A");

        String string4 = scanner.next();

        System.out.println("string1: " + string1);
        System.out.println("string2: " + string2);
        System.out.println("string3: " + string3);
        System.out.println("string4: " + string4);

        scanner.close();
    }
}
