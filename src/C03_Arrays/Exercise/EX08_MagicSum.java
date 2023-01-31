package C03_Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class EX08_MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int magicNumber = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numbersArr.length; i++) {
            int currentNum1 = numbersArr[i];
            for (int j = i + 1; j < numbersArr.length; j++) {
                int currentNum2 = numbersArr[j];
                if (currentNum1 + currentNum2 == magicNumber) {
                    System.out.printf("%d %d%n", currentNum1, currentNum2);
                }
            }

        }
    }
}
