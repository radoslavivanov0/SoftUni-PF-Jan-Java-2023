package C01_BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class EX12_EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        while (num % 2 != 0) {
            System.out.printf("Please write an even number.%n");
            num = Integer.parseInt(scanner.nextLine());
        }
        System.out.printf("The number is: %d%n", Math.abs(num));
    }
}
