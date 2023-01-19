package C01_BasicSyntaxConditionalStatementsAndLoops.MoreExercise;

import java.util.Scanner;

public class EX01_SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;
        int midNumber = 0;
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());
        if (firstNumber > maxNumber) {
            maxNumber = firstNumber;
        }
        if (secondNumber > maxNumber) {
            maxNumber = secondNumber;
        }
        if (thirdNumber > maxNumber) {
            maxNumber = thirdNumber;
        }
        if (firstNumber < minNumber) {
            minNumber = firstNumber;
        }
        if (secondNumber < minNumber) {
            minNumber = secondNumber;
        }
        if (thirdNumber < minNumber) {
            minNumber = thirdNumber;
        }
        if ((firstNumber == maxNumber && thirdNumber == minNumber) || (thirdNumber == maxNumber && firstNumber == minNumber)) {
            midNumber = secondNumber;
        } else if (secondNumber == maxNumber && thirdNumber == minNumber || secondNumber == minNumber && thirdNumber == maxNumber) {
            midNumber = firstNumber;
        } else {
            midNumber = thirdNumber;
        }
        System.out.println(maxNumber);
        System.out.println(midNumber);
        System.out.println(minNumber);
    }
}
