package C03_Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class EX09_ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] initialArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int[] modifiedArr = new int[initialArr.length];
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            if (command.contains("swap")) {
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);
                int element1 = initialArr[index1];
                int element2 = initialArr[index2];
                initialArr[index1] = element2;
                initialArr[index2] = element1;
                for (int i = 0; i < initialArr.length; i++) {
                    if (i == index1) {
                        modifiedArr[i] = element1;
                    } else if (i == index2) {
                        modifiedArr[i] = element2;
                    } else {
                        modifiedArr[i] = initialArr[i];
                    }
                }
            } else if (command.contains("multiply")) {
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);
                int element1 = initialArr[index1];
                int element2 = initialArr[index2];
                int multiply = element1 * element2;
                initialArr[index1] = multiply;
                for (int i = 0; i < initialArr.length; i++) {
                    if (i == index1) {
                        modifiedArr[i] = initialArr[i] * initialArr[index2];
                    } else {
                        modifiedArr[i] = initialArr[i];
                    }
                }
            } else if (command.contains("decrease")) {
                for (int i = 0; i < initialArr.length; i++) {
                    modifiedArr[i] = initialArr[i] - 1;
                }
                initialArr = modifiedArr;
                modifiedArr = new int[initialArr.length];
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < initialArr.length; i++) {
            if (i == initialArr.length - 1) {
                System.out.printf("%d", initialArr[i]);
            } else {
                System.out.printf("%d, ", initialArr[i]);
            }
        }
    }
}