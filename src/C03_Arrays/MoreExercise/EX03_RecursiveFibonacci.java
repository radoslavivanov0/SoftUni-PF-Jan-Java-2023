package C03_Arrays.MoreExercise;

import java.util.Scanner;

public class EX03_RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(GetFibonacci(n));
    }
    private static int GetFibonacci(int n) {
        int[] fibonacciArr = new int[n + 2];
        fibonacciArr[0] = 0;
        fibonacciArr[1] = 1;
        for (int i = 2; i <= n ; i++) {
            fibonacciArr[i] = fibonacciArr[i - 1] + fibonacciArr[i - 2];
        }
        return fibonacciArr[n];
    }
}
