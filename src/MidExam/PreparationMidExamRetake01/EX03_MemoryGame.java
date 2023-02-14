package MidExam.PreparationMidExamRetake01;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EX03_MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> elements = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .collect(Collectors.toList());
        String input = scanner.nextLine();
        int count = 0;
        while (!input.equals("end")) {
            count++;
            String[] tokens = input.split("\\s+");
            int firstIndex = Integer.parseInt(tokens[0]);
            int secondIndex = Integer.parseInt(tokens[1]);
            if (cheat(firstIndex, secondIndex, elements)) {
                System.out.println("Invalid input! Adding additional elements to the board");
                elements.add(elements.size() / 2, String.format("-%da", count));
                elements.add(elements.size() / 2, String.format("-%da", count));
            } else {
                String firstElement = elements.get(firstIndex);
                String secondElement = elements.get(secondIndex);
                if (firstElement.equals(secondElement)) {
                    System.out.printf("Congrats! You have found matching elements -%s!%n", firstElement);
                    elements.remove(firstElement);
                    elements.remove(secondElement);
                } else {
                    System.out.println("Try again!");
                }
            }
            if (elements.isEmpty()) {
                break;
            }
            input = scanner.nextLine();
        }
        if (elements.isEmpty()) {
            System.out.printf("You have won in %d turns!%n", count);
        } else {
            System.out.println("Sorry you lose :(");
            System.out.println(String.join(" ", elements));
        }
    }
    public static boolean cheat(int firstIndex, int secondIndex, List<String> elements) {
        if (firstIndex == secondIndex || isInvalidIndex(firstIndex, elements) || isInvalidIndex(secondIndex, elements)) {
            return true;
        }
        return false;
    }
    public static boolean isInvalidIndex(int index, List<String> elements) {
        if (index < 0 || index >= elements.size()) {
            return true;
        }
        return false;
    }
}
