package C04_Methods.Exercise;

import java.util.Scanner;

public class EX09_PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        while (!command.equals("END")) {
            int currentNumber = Integer.parseInt(command);
            System.out.println(isPalindrome(currentNumber));
            command = scanner.nextLine();
        }
    }

    public static boolean isPalindrome(int currentNumber) {
         int reversed = 0;
         int original = currentNumber;
         while (currentNumber > 0) {
             int lastDigit = currentNumber % 10;
             reversed = reversed * 10 + lastDigit;
             currentNumber = currentNumber / 10;
         }
         return reversed == original;
    }
}
