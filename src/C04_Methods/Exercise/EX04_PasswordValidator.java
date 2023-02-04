package C04_Methods.Exercise;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class EX04_PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        boolean isValidPassword = isLengthValid(password) && isAlphanumeric(password) && hasAtLeastTwoDigits(password);
        if (isValidPassword) {
            System.out.println("Password is valid");
        } else {
            if (!isLengthValid(password)) {
                System.out.println("Password must be between 6 and 10 characters");
            }
            if (!isAlphanumeric(password)) {
                System.out.println("Password must consist only of letters and digits");
            }
            if (!hasAtLeastTwoDigits(password)) {
                System.out.println("Password must have at least 2 digits");
            }
        }
    }
    private static boolean isLengthValid(String password) {
        return password.length() >= 6 && password.length() <= 10;
    }
    public static boolean isAlphanumeric(String password) {
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
        }
        return true;
    }
    public static boolean hasAtLeastTwoDigits(String password) {
        int count = 0;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        if (count >= 2) {
            return true;
        }
        return false;
    }
}
