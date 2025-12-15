package hw_4.task4;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        String[] names = {"Petya", "Masha", "Olena", "Fedya", "Sasha", "Anton", "Glib"};
        int[] times = {10, 12, 14, 16, 18, 20};
        String[] locations = {"school", "shop", "church", "gym", "movie", "polyclinic"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the index for the name (from 0 to " + (names.length - 1) + "):");

        int indexName = -1;
        while (indexName < 0 || indexName >= names.length) {
            System.out.print("Name index: ");
            if (scanner.hasNextInt()) {
                indexName = scanner.nextInt();
                if (indexName < 0 || indexName >= names.length) {
                    System.out.println("Error: Index must be in the range 0 to " + (names.length - 1) + ".");
                }
            } else {
                System.out.println("Error: Enter an integer.");
                scanner.next();
            }
        }

        int indexTime = -1;
        while (indexTime < 0 || indexTime >= times.length) {
            System.out.print("Enter the index for the time (from 0 to " + (times.length - 1) + "): ");
            if (scanner.hasNextInt()) {
                indexTime = scanner.nextInt();
                if (indexTime < 0 || indexTime >= times.length) {
                    System.out.println("Error: Index must be in the range 0 to " + (times.length - 1) + ".");
                }
            } else {
                System.out.println("Error: Enter an integer.");
                scanner.next();
            }
        }

        int indexLocation = -1;
        while (indexLocation < 0 || indexLocation >= locations.length) {
            System.out.print("Enter the index for the location (від 0 до " + (locations.length - 1) + "): ");
            if (scanner.hasNextInt()) {
                indexLocation = scanner.nextInt();
                if (indexLocation < 0 || indexLocation >= locations.length) {
                    System.out.println("Error: Index must be in range from 0 to" + (locations.length - 1) + ".");
                }
            } else {
                System.out.println("Error: Enter an integer.");
                scanner.next();
            }
        }

        scanner.close();

        String name = names[indexName];
        int time = times[indexTime];
        String location = locations[indexLocation];

        String message = String.format("%s will go to %s at %02d:00", name, location, time);

        System.out.println("\n");
        System.out.println(message);
    }
}

