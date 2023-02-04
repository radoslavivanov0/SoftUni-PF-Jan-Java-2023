package C04_Methods.Exercise;

import java.util.Scanner;

public class EX06_MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        printMiddleCharacter(input);
    }

    private static void printMiddleCharacter(String input) {
        if (input.length() % 2 != 0) {
            int indexOfMiddleCharacter = input.length() / 2;
            System.out.println(input.charAt(indexOfMiddleCharacter));
        } else {
            int indexOfFirstMiddleCharacter = input.length() / 2 - 1;
            int indexOfSecondMiddleCharacter = input.length() / 2;
            System.out.print(input.charAt(indexOfFirstMiddleCharacter));
            System.out.print(input.charAt(indexOfSecondMiddleCharacter));
        }
    }
}
