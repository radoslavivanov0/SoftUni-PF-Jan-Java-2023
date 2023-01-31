package C03_Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class EX04_ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String[] originalArr = scanner.nextLine().split(" ");
        int[] originalArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int rotations = Integer.parseInt(scanner.nextLine());
        int[] secondArr = new int[originalArr.length];
//        String[] secondArr = new String[originalArr.length];
        for (int i = 0; i < rotations; i++) {
            for (int j = 0; j < secondArr.length; j++) {
                if (j == 0) {
                    secondArr[0] = originalArr[1];
                } else if (j == secondArr.length - 1){
                    secondArr[j] = originalArr[0];
                } else {
                    secondArr[j] = originalArr[j + 1];
                }
            }
            originalArr = secondArr;
            secondArr = new int[originalArr.length];
        }
        for (int s : originalArr) {
            System.out.print(s + " ");
        }
    }
}
