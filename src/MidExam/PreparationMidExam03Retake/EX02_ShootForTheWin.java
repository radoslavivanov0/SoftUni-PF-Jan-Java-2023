package MidExam.PreparationMidExam03Retake;

import java.util.Arrays;
import java.util.Scanner;

public class EX02_ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] targetsSequence = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        String command = scanner.nextLine();
        int count = 0;
        while (!command.equals("End")) {
            int index = Integer.parseInt(command);

            if (index >= 0 && index <= targetsSequence.length - 1) {
                int value = targetsSequence[index];
                targetsSequence[index] = -1;
                count++;
                for (int i = 0; i < targetsSequence.length; i++) {
                    if (targetsSequence[i] == -1 || i == index) {
                        continue;
                    }
                    if (targetsSequence[i] > value) {
                        targetsSequence[i] -= value;
                    } else {
                        targetsSequence[i] += value;
                    }
                }
            }
            command = scanner.nextLine();
        }
        System.out.print("Shot targets: " + count + " -> ");
        for (int item : targetsSequence) {
            System.out.print(item + " ");
        }
    }
}
