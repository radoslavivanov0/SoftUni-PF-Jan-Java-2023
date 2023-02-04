package C04_Methods.Exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class EX02_VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        getVowelsCount(input);
    }
    public static void getVowelsCount(String input) {
        // vowels: a, e, i, o and u
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u' || input.charAt(i) == 'A' || input.charAt(i) == 'E' || input.charAt(i) == 'I' || input.charAt(i) == 'O' || input.charAt(i) == 'U') {
                count++;
            }
        }
        System.out.println(count);
    }
}
