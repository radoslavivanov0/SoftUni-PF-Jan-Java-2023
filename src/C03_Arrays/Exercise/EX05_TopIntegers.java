package C03_Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class EX05_TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbersArr.length; i++) {
            int currentNum = numbersArr[i];
            for (int j = i + 1; j < numbersArr.length; j++) {
                if (max < numbersArr[j]) {
                    max = numbersArr[j];
                }
            }
            if (i == numbersArr.length - 1) {
                System.out.print(currentNum);
            } else if (currentNum > max){
                System.out.print(currentNum + " ");
            }
            max = 0;
        }
    }
}
