package C03_Arrays.MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EX04_LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int maxLength = 0;
        int lastIndex = -1;
        int[] lenArr = new int[numbersArr.length];
        int[] previousArr = new int[numbersArr.length];

        for (int i = 0; i < numbersArr.length; i++) {
            lenArr[i] = 1;
            previousArr[i] = -1;
            for (int j = 0; j < i; j++) {
                if (numbersArr[j] < numbersArr[i] && lenArr[j] + 1 > lenArr[i]) {
                    lenArr[i] = lenArr[j] + 1;
                    previousArr[i] = j;
                }
            }
            if (lenArr[i] > maxLength) {
                maxLength = lenArr[i];
                lastIndex = i;
            }
        }
        int[] lisArr = new int[maxLength];
        int currentIndex = maxLength - 1;

        while (lastIndex != -1) {
            lisArr[currentIndex] = numbersArr[lastIndex];
            currentIndex--;
            lastIndex = previousArr[lastIndex];
        }
        for (int print = 0; print < lisArr.length; print++) {
            System.out.print(lisArr[print] + " ");
        }
    }
}
