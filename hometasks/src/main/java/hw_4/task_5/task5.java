package hw_4.task_5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        // 1. Оголошення та ініціалізація одновимірного масиву з 10 елементів
        int[] array = new int[10];
        // Генератор випадкових чисел
        Random random = new Random();

        // 2. Заповнення масиву випадковими числами (наприклад, від 0 до 99)
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100); // Випадкові числа в діапазоні [0, 99]
        }

        // Виведення створеного масиву на екран для перевірки
        System.out.println("Array of numbers: " + Arrays.toString(array));

        // 3. Зчитування числа, введеного користувачем із клавіатури
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to search for: ");
        int userNumber = scanner.nextInt();

        scanner.close();

        // 4. Перевірка наявності числа в масиві
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == userNumber) {
                found = true;
                break; // Зупиняємо цикл, якщо число знайдено
            }
        }

        // Алтернативний варіант пошуку за допомогою Stream API (Java 8+)
        // boolean found = IntStream.of(array).anyMatch(n -> n == userNumber);


        // 5. Виведення результату
        if (found) {
            System.out.println("Yes, a number " + userNumber + " is in the array.");
        } else {
            System.out.println("No, a number " + userNumber + " missing from the array.");
        }
    }
}