package C02_DataTypesAndVariables.Lab;

import java.util.Scanner;

public class EX05_ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();
        String delimiter = scanner.nextLine();
        System.out.println(firstName + delimiter + secondName);
        System.out.printf("%s%s%s%n", firstName, delimiter, secondName);
        String result = String.format("%s%s%s", firstName, delimiter, secondName);
        System.out.println(result);
    }
}
