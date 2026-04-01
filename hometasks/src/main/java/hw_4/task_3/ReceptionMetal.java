package hw_4.task_3;

import java.util.Scanner;

public class ReceptionMetal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the weight in kg that is stored in the warehouse: ");

        int warehouseVolume = scanner.nextInt();

        while (warehouseVolume > 0) {
            System.out.println("\nWarehouse space available: " + warehouseVolume);
            System.out.println("Enter the weight you want to lose: ");
            int weight = scanner.nextInt();

            if (weight < 5) {
                System.out.println("The minimum weight that can be donated is 5 kg");
            } else if (weight > warehouseVolume) {
                System.out.println("There is not enough space in the warehouse for this weight");
            } else {
                warehouseVolume -= weight;
                System.out.println("Metal accepted successfully");
            }
            if (warehouseVolume == 0) {
                System.out.println("The warehouse is completely full");
            }
        }
        scanner.close();
    }
}
