package hw_4.task_3;

import java.util.Scanner;

public class metalReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the maximum weight of metal that the warehouse can hold:");
        double maxCapacity;
        if (scanner.hasNextDouble()) {
            maxCapacity = scanner.nextDouble();
        } else {
            System.out.println("Invalid number entered. Please enter a numeric value.");
            scanner.close();
            return;
        }

        double currentWeight = 0;
        double remainingCapacity = maxCapacity;

        System.out.println("The warehouse is ready to receive metal: " + maxCapacity);

        while (remainingCapacity > 0) {
            System.out.println("\nCurrent remaining space in the warehouse: " + remainingCapacity);
            System.out.println("Enter the weight of metal you want to donate:");

            if (!scanner.hasNextDouble()) {
                System.out.println("Invalid value entered");
                scanner.next();
                continue;
            }

            double depositWeight = scanner.nextDouble();

            if (depositWeight == 0) {
                System.out.println("Metal acceptance completed by user. Total weight in warehouse: " + currentWeight);
                break;
            }

            if (depositWeight < 5) {
                System.out.println("Attention: The minimum weight for acceptance must be at least 5 kg.");
            } else if (depositWeight > remainingCapacity) {
                System.out.println(" Error: You are trying to pass" + depositWeight + "which is more than the remaining space  (" + remainingCapacity + "in stock");
                System.out.println("Operation canceled");
            }

            else {
                currentWeight += depositWeight;
                remainingCapacity -= depositWeight;
                System.out.println("Accepted " + depositWeight + "metal");
                System.out.println("Remaining space in the warehouse: " + remainingCapacity);
            }

            if (remainingCapacity == 0) {
                System.out.println("\nThe warehouse is completely full! Total weight: " + currentWeight);
                System.out.println("The program terminates");
            }
        }

        scanner.close();
    }
}
