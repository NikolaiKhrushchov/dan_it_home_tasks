package hw_4.task3;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalCapacity;
        double currentStock = 0;
        final double minimum_weight = 5.0;

        System.out.println("Enter the total warehouse capacity in kg:");
        if (scanner.hasNextDouble()) {
            totalCapacity = scanner.nextDouble();
            if (totalCapacity <= 0) {
                System.out.println("The warehouse capacity must be greater than zero. The program terminates.");
                scanner.close();
                return;
            }
        } else {
            System.out.println("Incorrect capacity input. The program terminates.");
            scanner.close();
            return;
        }

        System.out.println("The total capacity of the warehouse: " + totalCapacity + " kg");

        while (currentStock < totalCapacity) {
            System.out.println("\nCurrent remaining space in the warehouse: " + (totalCapacity - currentStock) + " kg");
            System.out.println("Enter the weight of metal to be delivered:");

            if (scanner.hasNextDouble()) {
                double incomingWeight = scanner.nextDouble();

                if (incomingWeight == 0) {
                    System.out.println("User initiated exit. Program is terminating.");
                    break;
                }

                if (incomingWeight < minimum_weight) {
                    System.out.println("The minimum weight for acceptance must be no less than " + minimum_weight + " kg. Try again.");
                    continue;
                }

                if (currentStock + incomingWeight > totalCapacity) {
                    System.out.println("You want to pass " + incomingWeight + " kg, but only left in stock " + (totalCapacity - currentStock) + "kg of space. Operation is not possible. ");
                    continue;
                }

                currentStock += incomingWeight;
                System.out.println("Accepted " + incomingWeight + " kg of metal.");
                System.out.println("Total weight in stock: " + currentStock + " kg.");

            } else {
                System.out.println("Incorrect weight entry. Please enter a numeric value.");
                scanner.next();
            }
        }

        System.out.println("\nThe warehouse space is full. Total weight in the warehouse: " + currentStock + " kg.");
        System.out.println("The program is terminating.");
        scanner.close();
    }
}
