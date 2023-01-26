package C03_Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class EX05_EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int evenSum = 0;
        int oddSum = 0;
        for (int item : numbersArr) {
            if (item % 2 == 0) {
                evenSum += item;
            } else {
                oddSum += item;
            }
        }
        int difference = evenSum - oddSum;
        System.out.println(difference);
    }
}