package C04_Methods.MoreExercise;

import java.util.Scanner;
import java.util.function.DoubleFunction;

public class EX01_DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dataType = scanner.nextLine();
        String input = scanner.nextLine();
        processData(dataType, input);
    }
    public static void processData(String dataType, String input) {
        switch (dataType) {
            case "int":
                int num = Integer.parseInt(input);
                System.out.println(num * 2);
                break;
            case "real":
                double real = Double.parseDouble(input);
                System.out.printf("%.2f", real * 1.5);
                break;
            case "string":
                System.out.println("$" + input + "$");
                break;
        }
    }
}
