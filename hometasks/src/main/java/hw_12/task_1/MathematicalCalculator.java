package hw_12.task_1;

import java.util.Scanner;

public class MathematicalCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Welcome to the math calculator!");

        while (true) {
            try {
                System.out.print("\nEnter the first number (or 'exit' to quit): ");
                String input1 = scanner.nextLine();
                if (input1.equalsIgnoreCase("exit")) {
                    break;
                }
                int num1 = parseNumber(input1);
                System.out.print("Select an operation (+, -, *, /): ");
                String opInput = scanner.nextLine();
                if (opInput.isEmpty()) {
                    System.out.println("Operation cannot be empty");
                    continue;
                }
                char operation = opInput.charAt(0);

                System.out.print("Enter the second number: ");
                String input2 = scanner.nextLine();
                int num2 = parseNumber(input2);

                int result = calculator.calculate(num1, num2, operation);
                System.out.println("Result: " + result);

            } catch (DivisionByZeroException er) {
                System.out.println(er.getMessage());
            } catch (CustomValueErrorException er) {
                System.out.println(er.getMessage());
            } catch (Exception er) {
                System.out.println("An unknown error occurred");
            }
        }

        System.out.println("Thank you for using the calculator! Bye!");
        scanner.close();
    }

    private static int parseNumber(String input) throws CustomValueErrorException {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException er) {
            throw new CustomValueErrorException("Error: You entered a non-numeric value. Please try again");
        }
    }
}
