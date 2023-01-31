package C04_Methods.Lab;

import java.util.Scanner;

public class EX10_MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        if (number < 0) {
            number = number * (-1);
        }
        int multiple = getMultipleOfEvensAndOdds(number);
        System.out.println(multiple);
    }
    public static int getMultipleOfEvensAndOdds(int number) {
        int evensSum = getSumOfEvenDigits(number);
        int oddsSum = getSumOfOddDigits(number);
        return evensSum * oddsSum;
    }
    public static int getSumOfEvenDigits(int number) {
        int evensSum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 == 0) {
                evensSum += lastDigit;
            }
            number = number / 10;
        }
        return evensSum;
    }
    public static int getSumOfOddDigits(int number) {
        int oddsSum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 != 0) {
                oddsSum += lastDigit;
            }
            number = number / 10;
        }
        return oddsSum;
    }
}
