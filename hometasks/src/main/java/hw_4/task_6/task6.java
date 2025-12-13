package hw_4.task_6;

import java.util.Random;

public class task6 {
    public static void main(String[] args) {
        int arraySize = 45;
        int minRange = -50;
        int maxRange = 50;
        int[] numbers = new int[arraySize];
        Random random = new Random();

        for (int i = 0; i < arraySize; i++) {
            numbers[i] = random.nextInt(maxRange - minRange + 1) + minRange;
        }

        System.out.println("Generated array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        int minElement = numbers[0];
        int maxElement = numbers[0];

        for (int i = 1; i < arraySize; i++) {
            if (numbers[i] < minElement) {
                minElement = numbers[i];
            }
            if (numbers[i] > maxElement) {
                maxElement = numbers[i];
            }
        }

        System.out.println("Minimal element: " + minElement);
        System.out.println("Maximum element: " + maxElement);
    }
}
