package MidExam.PreparationMidExam03Retake;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EX03_MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> targetsSequence = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] commmandParts = command.split("\\s+");
            if (commmandParts[0].contains("Shoot")) {
                int index = Integer.parseInt(commmandParts[1]);
                int power = Integer.parseInt(commmandParts[2]);
                if (index >= 0 && index <= targetsSequence.size() - 1) {
                    int newTarget = targetsSequence.get(index) - power;
                    targetsSequence.set(index, newTarget);
                    if (newTarget <= 0) {
                        targetsSequence.remove(index);
                    }
                }
            } else if (commmandParts[0].contains("Add")) {
                int index = Integer.parseInt(commmandParts[1]);
                int value = Integer.parseInt(commmandParts[2]);
                if (index >= 0 && index <= targetsSequence.size() - 1) {
                    targetsSequence.add(index, value);
                } else {
                    System.out.println("Invalid placement!");
                }
            } else if (commmandParts[0].contains("Strike")) {
                int index = Integer.parseInt(commmandParts[1]);
                int radius = Integer.parseInt(commmandParts[2]);
                int startIndex = index - radius;
                int endIndex = index + radius;
                if (startIndex >= 0 && endIndex <= targetsSequence.size() - 1) {
                    for (int i = endIndex; i >= startIndex; i--) {
                        targetsSequence.remove(i);
                    }
                } else {
                    System.out.println("Strike missed!");
                }
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < targetsSequence.size(); i++) {
            System.out.print(targetsSequence.get(i));
            if (i < targetsSequence.size() - 1) {
                System.out.print("|");
            }
        }
        System.out.println();
    }
}
