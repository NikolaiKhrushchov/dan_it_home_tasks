package hw_3.task_1;

import java.util.Scanner;

public class appropriation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter text into the console: ");
        String string1 = scanner.next();
        String string2 = scanner.next();
        String string3 = scanner.next();
        String string4 = scanner.next() + " " + scanner.next() + " " + scanner.next() + " " + scanner.next() + " " + scanner.next();

        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
        System.out.println(string4);

        scanner.close();
    }
}
