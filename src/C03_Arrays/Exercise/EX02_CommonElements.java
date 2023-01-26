package C03_Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class EX02_CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");
        for (int i = 0; i < secondArr.length; i++) {
            for (int j = 0; j < firstArr.length; j++) {
                if (firstArr[j].equals(secondArr[i])) {
                    System.out.print(secondArr[i] + " ");
                }
            }
        }
    }
}
