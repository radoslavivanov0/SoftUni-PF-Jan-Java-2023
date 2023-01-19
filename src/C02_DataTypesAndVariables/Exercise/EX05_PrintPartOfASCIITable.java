package C02_DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class EX05_PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startCharIndex = Integer.parseInt(scanner.nextLine());
        int endCharIndex = Integer.parseInt(scanner.nextLine());
        for (int i = startCharIndex; i <= endCharIndex; i++) {
            System.out.print((char)i + " ");
        }
    }
}
