package hw_3.task_6;

import java.util.Scanner;

public class CalculatorExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which of these programs are you interested in?(IntelliJ IDEA, Git, Java): ");
        String programs = scanner.nextLine();

        System.out.println("Which of these operating systems do you use?(Linux, MacOS, Windows): ");
        String os = scanner.nextLine();

        switch (programs) {
            case "IntelliJ IDEA":
                if (os.equalsIgnoreCase("Linux")) {
                    System.out.println("Your download link: https://www.jetbrains.com");
                } else if (os.equalsIgnoreCase("MacOS")) {
                    System.out.println("Your download link: https://www.jetbrains.com");
                } else if (os.equalsIgnoreCase("Windows")) {
                    System.out.println("Your download link: https://www.jetbrains.com");
                } else {
                    System.out.println("Sorry, there is no such operating system");
                }
                break;

            case "Git":
                if (os.equalsIgnoreCase("Linux")) {
                    System.out.println("Your download link: https://git-scm.com");
                } else if (os.equalsIgnoreCase("MacOS")) {
                    System.out.println("Your download link: https://git-scm.com");
                } else if (os.equalsIgnoreCase("Windows")) {
                    System.out.println("Your download link: https://git-scm.com");
                } else {
                    System.out.println("Sorry, there is no such operating system");
                }
                break;

            case "Java":
                if (os.equalsIgnoreCase("Linux")) {
                    System.out.println("Your download link: https://www.oracle.com");
                } else if (os.equalsIgnoreCase("MacOS")) {
                    System.out.println("Your download link: https://www.oracle.com");
                } else if (os.equalsIgnoreCase("Windows")) {
                    System.out.println("Your download link: https://www.oracle.com");
                } else {
                    System.out.println("Sorry, there is no such operating system");
                }
                break;

            default:
                System.out.println("Sorry, such a program does not exist");
                break;
        }
        scanner.close();
    }
}