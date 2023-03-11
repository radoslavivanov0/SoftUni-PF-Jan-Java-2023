package C08_TextProcessing.Lab;

import java.util.Scanner;

public class EX01_ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        while (!text.equals("end")) {
            String reversedWord = "";
            for (int i = text.length() - 1; i >= 0 ; i--) {
                char symbol = text.charAt(i);
                reversedWord += symbol;

            }
            System.out.printf("%s = %s%n", text, reversedWord);
            text = scanner.nextLine();
        }
    }
}
