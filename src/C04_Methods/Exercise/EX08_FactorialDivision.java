package C04_Methods.Exercise;

import java.math.BigDecimal;
import java.util.Scanner;

public class EX08_FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        double factorialA = calculateFactorial(firstNumber);
        double factorialB = calculateFactorial(secondNumber);
        double result = factorialA / factorialB;
        System.out.printf("%.2f", result);
    }

    private static double calculateFactorial(int n) {
        double fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
