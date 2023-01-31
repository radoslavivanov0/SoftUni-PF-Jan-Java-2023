package C04_Methods.Lab;

import java.util.Scanner;

public class EX09_GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        if (type.equals("int")) {
            int first = Integer.parseInt(scanner.nextLine());
            int second = Integer.parseInt(scanner.nextLine());
            System.out.println(getMax(first, second));
        } else if (type.equals("char") || type.equals("string")) {
            String first = scanner.nextLine();
            String second = scanner.nextLine();
            System.out.println(getMax(first, second));
        }
    }
    public static int getMax(int first, int second) {
        return Math.max(first, second);
    }
    public static char getMax(char first, char second) {
        if (first > second) {
            return first;
        }
        return second;
    }
    public static String getMax(String first, String second) {
        if (first.compareTo(second) >= 0) {
            return first;
        }
        return second;
    }
}
