package C01_BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class EX04_PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int number = startNumber; number <= endNumber ; number++) {
            System.out.printf(number + " ");
            sum += number;
        }
        System.out.println();
        System.out.println("Sum: " + sum);
    }
}
