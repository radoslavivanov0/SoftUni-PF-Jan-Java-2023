package C04_Methods.Exercise;

import java.util.Scanner;

public class EX10_TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        // check if top number
        // 1. sum of digits is divisible by 8
        // 2. holds at least one odd digit
        for (int number = 1; number <= n ; number++) {
            if (isSumDigitsDivisibleby8(number) && isContainsOddDigit(number)) {
                System.out.println(number);
            }
        }
    }
    // 1. create a method to check if sum digits is divisible by 8
    //true -> if sum is divisible by 8
    //false -> if sum is not divisible by 8
    public static boolean isSumDigitsDivisibleby8 (int number) {
        int sum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            sum += lastDigit;
            number = number / 10;
        }
        // 2. check if sum is divisible by 8
        return sum % 8 == 0;
//        if (sum % 8 == 0) {
//            return true;
//        } else {
//            return false;
//        }
    }
    // 2. create second method to check if number holds at least one odddigit
    // true -> if one odd digit at least
    // false -> if no odd digit
    public static boolean isContainsOddDigit(int number) {
        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 != 0) {
                return true;
            } else {
                number = number / 10;
            }
        }
        return false;
    }
}
