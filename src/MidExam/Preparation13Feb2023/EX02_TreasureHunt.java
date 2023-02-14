package MidExam.Preparation13Feb2023;

import java.util.Scanner;

public class EX02_TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] treasureChest = scanner.nextLine().split("\\|");
        String command = scanner.nextLine();
        while (!command.equals("Yohoho!")) {
            String[] commandParts = command.split(" ");
            switch (commandParts[0]) {
                case "Loot":
                    for (int i = 0; i < commandParts.length; i++) {
                        boolean alreadyContained = false;
                        for (int j = 0; j < commandParts.length; j++) {
                            if (commandParts[i].equals(treasureChest[j])) {
                                alreadyContained = true;
                                break;
                            }
                        }
                        if (!alreadyContained) {
                            String newChest = commandParts[i] + " " + String.join(" ", treasureChest);
                            treasureChest = newChest.split(" ");
                        }
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(commandParts[1]);
                    String dropItem = treasureChest[index];
                    if (index >= 0 && index <= treasureChest.length - 1) {
                        for (int i = index; i < treasureChest.length - 1; i++) {
                            treasureChest[i] = treasureChest[i + 1];
                        }
                        treasureChest[treasureChest.length - 1] = dropItem;
                    } else {
                        break;
                    }
                    break;
                case "Steal":
                    int count = Integer.parseInt(commandParts[1]);
                    if (count >= 0 && count <= treasureChest.length - 1) {
                        for (int i = 0; i < count; i++) {
                            System.out.print(treasureChest[treasureChest.length - count + i]);
                            if (i != count - 1) {
                                System.out.print(", ");
                            }
                        }
                        String[] tempChest = new String[treasureChest.length - count];
                        for (int i = 0; i < tempChest.length; i++) {
                            tempChest[i] = treasureChest[i];
                        }
                        treasureChest = tempChest;
                    } else if (count >= 0) {
                        for (int i = 0; i < treasureChest.length; i++) {
                            System.out.print(treasureChest[i]);
                            if (i != treasureChest.length - 1) {
                                System.out.print(", ");
                            }
                        }
                        treasureChest = new String[0];
                    }
                    System.out.println();
                    break;
            }
            command = scanner.nextLine();
        }
        String treasureCount = String.join("", treasureChest);
        int charCounter = 0;
        for (int i = 0; i < treasureCount.length(); i++) {
            charCounter++;
        }
        double averageTreasure = (1.0 * charCounter) / treasureChest.length;
        if (charCounter > 0) {
            System.out.printf("Average treasure gain: %.2f pirate credits.", averageTreasure);
        } else {
            System.out.println("Failed treasure hunt.");
        }
    }
}
