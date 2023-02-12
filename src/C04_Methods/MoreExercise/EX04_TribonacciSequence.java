package C04_Methods.MoreExercise;

import java.math.BigInteger;
import java.util.Scanner;

public class EX04_TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        getTribonacciSequence(num);
    }
    private static void getTribonacciSequence(int num) {
        int[] tribArr = new int[num];
        if (num >= 3) {
            for (int i = 0; i <= num ; i++) {
                if (i <= 3) {
                    tribArr[0] = 1;
                    tribArr[1] = 1;
                    tribArr[2] = 2;
                } else {
                    tribArr[i - 1] = tribArr[i - 2] + tribArr[i - 3] + tribArr[i - 4];
                }
            }
        }
        if (num == 1) {
            System.out.println(1);
        } else if (num == 2) {
            System.out.println("1, 1");
        } else {
            for (int i = 0; i <= tribArr.length - 1 ; i++) {
                System.out.print(tribArr[i] + " ");
            }
        }
    }
}
