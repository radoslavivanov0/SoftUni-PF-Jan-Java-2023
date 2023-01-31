package C04_Methods.Lab;

import java.util.Scanner;

public class EX07_RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        String repeated = repeatString(input, count);
        System.out.println(repeated);
    }
    public static String repeatString(String input, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            String current = input;
            result += current;
        }
        return result;
    }
}
