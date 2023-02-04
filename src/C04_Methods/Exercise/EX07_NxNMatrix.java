package C04_Methods.Exercise;

import java.util.Scanner;

public class EX07_NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        printNxNMatrix(n);
    }

    private static void printNxNMatrix(int n) {
        for (int row = 0; row < n; row++) {
            for (int column = 0; column < n ; column++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
