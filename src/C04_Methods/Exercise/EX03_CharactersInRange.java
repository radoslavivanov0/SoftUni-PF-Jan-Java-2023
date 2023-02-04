package C04_Methods.Exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class EX03_CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);
        getCharacters(firstChar, secondChar);
    }
    public static void getCharacters(char firstChar, char secondChar) {
        int startCharacter = Math.min(firstChar, secondChar);
        int endCharacter = Math.max(firstChar, secondChar);
        for (int i = ++startCharacter; i < endCharacter; i++) {
            System.out.print((char) i + " ");
        }
        System.out.println();
    }
}
