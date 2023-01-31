package C03_Arrays.MoreExercise;

import java.util.Scanner;

public class EX02_PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int rows = 1; rows <= n ; rows++) {
            int number = 1;
            for (int columns = 1; columns <= rows; columns++) {
                System.out.print(number + " ");
                number = number * (rows - columns) / columns;
            }
            System.out.println();
        }
    }
}
