package C04_Methods.Exercise;

import java.util.Scanner;

public class EX01_SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());
        System.out.println(getSmallestNumber(firstNumber, secondNumber, thirdNumber));
    }
    public static int getSmallestNumber (int firstNumber, int secondNumber, int thirdNumber) {
        int smallestNumber = 0;
        if (firstNumber < secondNumber && firstNumber < thirdNumber) {
            return smallestNumber = firstNumber;
        } else if (secondNumber < firstNumber && secondNumber < thirdNumber) {
            return smallestNumber = secondNumber;
        } else if (thirdNumber < firstNumber && thirdNumber < secondNumber) {
            return smallestNumber = thirdNumber;
        }
        return smallestNumber;
    }
}
