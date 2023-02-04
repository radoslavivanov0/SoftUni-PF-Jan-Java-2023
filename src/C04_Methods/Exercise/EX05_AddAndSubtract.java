package C04_Methods.Exercise;

import java.util.Scanner;

public class EX05_AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());
        int result = getSum(firstNumber, secondNumber);
        System.out.println(getSubtract(result, thirdNumber));
    }

    public static int getSum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    public static int getSubtract(int result, int thirdNumber) {
        return result - thirdNumber;
    }
}
