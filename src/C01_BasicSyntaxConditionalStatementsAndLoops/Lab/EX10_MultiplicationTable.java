package C01_BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class EX10_MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int times = 1;
        while (times <= 10) {
            System.out.printf("%d X %d = %d%n", number, times, number * times);
            times++;
        }
    }
}
