package hw_4.task_4;

import java.util.Scanner;

public class ArrayNames{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = {"Petya", "Masha", "Olena", "Fedya", "Sasha", "Anton", "Glib"};
        int[] numbers = {10, 12, 14, 16, 18, 20};
        String[] establishments = {"school", "store", "church", "gym", "cinema", "clinic"};

        System.out.println("Please enter 3 numbers via enter: ");

        int namesIndex = input.nextInt();
        int numbersIndex = input.nextInt();
        int establishmentsIndex = input.nextInt();

        System.out.println(names[namesIndex] + " will go to " + establishments[establishmentsIndex] + " about " + numbers[numbersIndex]);

        input.close();
    }
}
