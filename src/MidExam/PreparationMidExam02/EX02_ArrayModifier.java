package MidExam.PreparationMidExam02;

import java.util.Arrays;
import java.util.Scanner;

public class EX02_ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] originalArr = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] modifiedArr = new int[originalArr.length];
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] commandParts = command.split(" ");
            int index1 = 0;
            int index2 = 0;
            int firstElement = 0;
            int secondElement = 0;
            switch (commandParts[0]) {
                case "swap":
                    index1 = Integer.parseInt(commandParts[1]);
                    index2 = Integer.parseInt(commandParts[2]);
                    firstElement = originalArr[index1];
                    secondElement = originalArr[index2];
                    originalArr[index1] = secondElement;
                    originalArr[index2] = firstElement;
                    for (int i = 0; i < originalArr.length; i++) {
                        if (i == index1) {
                            modifiedArr[i] = firstElement;
                        } else {
                            modifiedArr[i] = secondElement;
                        }
                    }
                    break;
                case "multiply":
                    index1 = Integer.parseInt(commandParts[1]);
                    index2 = Integer.parseInt(commandParts[2]);
                    firstElement = originalArr[index1];
                    secondElement = originalArr[index2];
                    originalArr[index1] = firstElement * secondElement;
                    for (int i = 0; i < originalArr.length; i++) {
                        if (i == index1) {
                            modifiedArr[i] = originalArr[i] + originalArr[index2];
                        } else {
                            modifiedArr[i] = originalArr[i];
                        }
                    }
                    break;
                case "decrease":
                    for (int i = 0; i < originalArr.length; i++) {
                        modifiedArr[i] = originalArr[i] - 1;
                    }
                    originalArr = modifiedArr;
                    modifiedArr = new int[originalArr.length];
                    break;
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < originalArr.length; i++) {
            if (i == modifiedArr.length - 1) {
                System.out.printf("%d", originalArr[i]);
            } else {
                System.out.printf("%d, ", originalArr[i]);
            }
        }
    }
}
