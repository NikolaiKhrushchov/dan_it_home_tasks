package hw_4.task6;

import java.util.Random;

public class task6 {
    public static void main(String[] args) {
        int arraySize = 45;
        int minValue = -50;
        int maxValue = 50;

        int[] array = new int[arraySize];

        Random random = new Random();

        int minElement = 0;
        int maxElement = 0;

        System.out.println("Array elements:");

        for (int i = 0; i < arraySize; i++) {
            array[i] = random.nextInt(maxValue - minValue + 1) + minValue;

            System.out.print(array[i] + (i < arraySize - 1 ? ", " : ""));


            if (i == 0) {
                minElement = array[i];
                maxElement = array[i];
            } else {
                if (array[i] < minElement) {
                    minElement = array[i];
                }
                if (array[i] > maxElement) {
                    maxElement = array[i];
                }
            }
        }

        System.out.println("\n");

        System.out.println("Minimum array element: " + minElement);
        System.out.println("Maximum array element: " + maxElement);
    }
}
