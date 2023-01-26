package C02_DataTypesAndVariables.MoreExercise;

import java.util.Scanner;

public class EX01_DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        String dataType = "";
        while (!command.equals("END")) {
            Scanner input = new Scanner(command);
            if (input.hasNextBoolean()) {
                dataType = "boolean";
                System.out.printf("%s is %s type%n", command, dataType);
            } else if (input.hasNextInt()) {
                dataType = "integer";
                System.out.printf("%s is %s type%n", command, dataType);
            } else if (command.length() == 1) {
                dataType = "character";
                System.out.printf("%s is %s type%n", command, dataType);
            } else if (input.hasNextDouble()) {
                dataType = "floating point";
                System.out.printf("%s is %s type%n", command, dataType);
            } else if (input.hasNextLine()) {
                dataType = "string";
                System.out.printf("%s is %s type%n", command, dataType);
            }
            command = scanner.nextLine();
        }
    }
}
