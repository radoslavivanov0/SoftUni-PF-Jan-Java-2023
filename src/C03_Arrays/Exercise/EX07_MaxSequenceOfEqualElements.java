package C03_Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class EX07_MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int length = 1;
        int bestLength = 0;
        int endIndex = -1;
        for (int i = 0; i < numbersArr.length - 1; i++) {
            int currentNum = numbersArr[i];
            int secondNum = numbersArr[i + 1];
            if (currentNum == secondNum) {
                length++;
                if (length > bestLength) {
                    bestLength = length;
                    endIndex = i + 1;
                }
            } else {
                length = 1;
            }
        }
        for (int i = endIndex; i > endIndex - bestLength; i--) {
            System.out.print(numbersArr[i] + " ");
        }
    }
}
