package MidExam.PreparationMidExam04;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class EX02_ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> groceries = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("Go Shopping!")) {
            String[] commandParts = command.split(" ");
            String action = commandParts[0];
            String item = commandParts[1];
            switch (commandParts[0]) {
                case "Urgent":
                    String itemToAdd = commandParts[1];
                    if (!groceries.contains(itemToAdd)) {
                        groceries.add(0, itemToAdd);
                    }

                    break;
                case "Unnecessary":
                    String itemToRemove = commandParts[1];
                    if (groceries.contains(itemToRemove)) {
                        groceries.remove(itemToRemove);
                    }
                    break;
                case "Correct":
                    String oldItem = commandParts[1];
                    String newItem = commandParts[2];
                    if (groceries.contains(oldItem)) {
                        int index = groceries.indexOf(oldItem);
                        groceries.set(index, newItem);
                    }
                    break;
                case "Rearrange":
                    String itemToRearrange = commandParts[1];
                    if (groceries.contains(itemToRearrange)) {
                        groceries.remove(itemToRearrange);
                        groceries.add(itemToRearrange);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println(String.join(", ", groceries));
    }
}
