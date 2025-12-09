package hw_3.task_6;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What program are you interested in? (Enter: IntelliJ IDEA, Git, Java)");
        String programName = scanner.nextLine().trim();

        System.out.println("What operating system are you using? (Enter: Linux, MacOS, Windows)");
        String systemName = scanner.nextLine().trim();

        String downloadLink;

        switch (programName.toLowerCase()) {
            case "intellij idea":
                switch (systemName) {
                    case "linux":
                        downloadLink = "www.linux.com";
                        break;
                    case "macos":
                        downloadLink = "www.macos.com";
                        break;
                    case "windows":
                        downloadLink = "www.windows.com";
                        break;
                    default:
                        System.out.println("No OS selected: "  + systemName);
                        return;
                }
                break;
            case "git":
                switch (systemName.toLowerCase()) {
                    case "linux":
                        downloadLink = "https://download/linux";
                        break;
                    case "macos":
                        downloadLink = "https://download/macos";
                        break;
                    case "windows":
                        downloadLink = "https://download/windows";
                        break;
                    default:
                        System.out.println("No OS selected: " + systemName);
                        return;
                }
                break;
            case "java":
                switch (systemName.toLowerCase()) {
                    case "linux":
                        downloadLink = "www.oracle.com";
                        break;
                    case "macos":
                        downloadLink = "www.oracle.com";
                        break;
                    case "windows":
                        downloadLink = "www.oracle.com";
                        break;
                    default:
                        System.out.println("No OS selected: " + systemName);
                        return;
                }
                break;
            default:
                System.out.println("There is no program with that name: " + programName);
                return;
        }

        System.out.println("Download link " + programName + " for " + systemName + ":");
        System.out.println(downloadLink);
    }
}