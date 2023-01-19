package C01_BasicSyntaxConditionalStatementsAndLoops.MoreExercise;

import java.util.Scanner;

public class EX04_ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String normalString = scanner.nextLine();
        String reversedString = "";
        for (int position = normalString.length() - 1; position >= 0 ; position--) {
            char currentSymbol = normalString.charAt(position);
            reversedString += currentSymbol;
        }
        System.out.println(reversedString);
    }
}
