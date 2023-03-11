package C08_TextProcessing.Lab;

import java.util.Scanner;

public class EX04_TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bannedWordsArr = scanner.nextLine().split(", ");
        String text = scanner.nextLine();
        for (String banWord : bannedWordsArr) {
            String asterisk = repeatString(banWord.length());
            text = text.replace(banWord, asterisk);
        }
        System.out.println(text);
    }
    public static String repeatString(int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += "*";
        }
        return result;
    }
}
