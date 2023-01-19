package C02_DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class EX01_IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte firstNumber = Byte.parseByte(scanner.nextLine());
        byte secondNumber = Byte.parseByte(scanner.nextLine());
        byte thirdNumber = Byte.parseByte(scanner.nextLine());
        byte fourthNumber = Byte.parseByte(scanner.nextLine());
//        int sum = firstNumber + secondNumber;
//        int division = sum / thirdNumber;
//        int result = division * fourthNumber;
        int result = ((firstNumber + secondNumber) / thirdNumber) * fourthNumber;
        System.out.println(result);
    }
}
