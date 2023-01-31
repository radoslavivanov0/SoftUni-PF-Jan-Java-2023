package C04_Methods.Lab;

import java.util.Scanner;

public class EX11_MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();
        double secondNumber = Double.parseDouble(scanner.nextLine());
        System.out.printf("%.0f", mathOperations(firstNumber, operator, secondNumber));
    }
    public static double mathOperations(double firstNumber, String operator, double secondNumber) {
        double result = 0.0;
        switch (operator) {
            case "/":
                result = firstNumber / secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
        }
        return result;
    }
}
