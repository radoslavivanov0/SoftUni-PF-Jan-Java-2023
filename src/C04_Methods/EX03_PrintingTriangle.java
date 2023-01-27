package C04_Methods;

import java.util.Scanner;

public class EX03_PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printTriangle(Integer.parseInt(scanner.nextLine()));
    }
    public static void printLine (int start, int end) {
        for (int i = start; i <= end ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void printTriangle (int n) {
        for (int i = 1; i <= n; i++) {
            printLine(1, i);
        }
        for (int i = n - 1; i >= 1; i--) {
            printLine(1, i);
        }
    }
}
