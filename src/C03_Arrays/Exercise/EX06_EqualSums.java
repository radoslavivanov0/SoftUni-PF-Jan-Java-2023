package C03_Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class EX06_EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        boolean isSumEqual = false;
        for (int i = 0; i < numbersArr.length; i++) {
            int currentElement = numbersArr[i];
            int leftSum = 0;
            int rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += numbersArr[j];
            }
            for (int j = numbersArr.length - 1; j > i ; j--) {
                rightSum += numbersArr[j];
            }
            if (leftSum == rightSum) {
                System.out.println(i);
                isSumEqual = true;
                break;
            }
        }
        if (!isSumEqual) {
            System.out.println("no");
        }
    }
}
