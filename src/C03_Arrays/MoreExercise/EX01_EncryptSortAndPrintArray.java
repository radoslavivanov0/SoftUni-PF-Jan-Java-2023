package C03_Arrays.MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EX01_EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrLength = Integer.parseInt(scanner.nextLine());
        String[] sequenceOfStrings = new String[arrLength];
        int[] valueOfString = new int[arrLength];
        for (int i = 0; i < sequenceOfStrings.length; i++) {
            sequenceOfStrings[i] = scanner.nextLine();
            int vowelsSum = 0;
            int consonantsSum = 0;
            char[] charArr = sequenceOfStrings[i].toCharArray();
            for (char index : charArr) {
                if (index == 'a' || index == 'e' || index == 'i' || index == 'o' || index == 'u' || index == 'A' || index == 'E' || index == 'I' || index == 'O' || index == 'U') {
                    vowelsSum += ((int) index * sequenceOfStrings[i].length());
                } else {
                    consonantsSum += ((int) index / sequenceOfStrings[i].length());
                }
            }
            int wordSum = vowelsSum + consonantsSum;
            valueOfString[i] = wordSum;
        }
        Arrays.sort(valueOfString);
        for (int value : valueOfString) {
            System.out.println(value);
        }
    }
}
