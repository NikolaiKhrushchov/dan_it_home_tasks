package hw_4.task_4;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        String[] names = {"Petya", "Masha", "Olena", "Fedya", "Sasha", "Anton", "Glib"};
        int[] times = {10, 12, 14, 16, 18, 20};
        String[] places = {"School", "Shop", "Church", "Gym", "Movie", "Policlinic"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter three indices that correspond to the proposed elements:");

        try {
            int nameIndex = scanner.nextInt() - 1;
            int timeIndex = scanner.nextInt() - 1;
            int placeIndex = scanner.nextInt() - 1;

            if (nameIndex >= 0 && nameIndex < names.length &&
                    timeIndex >= 0 && timeIndex < times.length &&
                    placeIndex >= 0 && placeIndex < places.length) {

                String name = names[nameIndex];
                int time = times[timeIndex];
                String place = places[placeIndex];

                // Виведення результату
                String message = name + " will go to " + place + " at " + time + ":00" + "o'clock";
                System.out.println("\"" + message + "\"");
            }
            {
                System.out.println("Error: One or more indices are outside the array range");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Please enter only integers.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
