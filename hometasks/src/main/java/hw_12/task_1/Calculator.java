package hw_12.task_1;

public class Calculator {
    public int calculate(int num1, int num2, char operation) throws DivisionByZeroException {
        switch (operation) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    throw new DivisionByZeroException("Error: Division by zero is not possible!");
                }
                return num1 / num2;
        }
        return 0;
    }
}
