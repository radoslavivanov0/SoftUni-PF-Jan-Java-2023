package C03_Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class EX03_ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] firstArr = new int[n];
        int[] secondArr = new int[n];
        for (int i = 0; i < n; i++) {
            String[] currentNum = scanner.nextLine().split(" ");
            if (i % 2 == 0) {
                firstArr[i] = Integer.parseInt(currentNum[0]);
                secondArr[i] = Integer.parseInt(currentNum[1]);
            } else {
                firstArr[i] = Integer.parseInt(currentNum[1]);
                secondArr[i] = Integer.parseInt(currentNum[0]);
            }
        }
        for (int i = 0; i < firstArr.length; i++) {
            System.out.print(firstArr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < secondArr.length; i++) {
            System.out.print(secondArr[i] + " ");
        }
    }
}
