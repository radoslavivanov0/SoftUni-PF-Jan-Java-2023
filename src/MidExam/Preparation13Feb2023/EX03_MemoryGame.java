package MidExam.Preparation13Feb2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EX03_MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> sequence = Arrays.asList(scanner.nextLine().split(" "));
        List<String> remaining = new ArrayList<>(sequence);
        int moves = 0;
        String command = scanner.nextLine();
        while (!command.equals("end")) {

            if (command.equals("end") && !remaining.isEmpty()) {
                System.out.println("Sorry you lose :(");
                System.out.println(String.join(" ", remaining));
                break;
            }

            String[] indexes = command.split("\\s+");
            int index1 = Integer.parseInt(indexes[0]);
            int index2 = Integer.parseInt(indexes[1]);
            if (index1 < 0 || index1 >= sequence.size() || index2 < 0 || index2 >= sequence.size() || index1 == index2) {
                moves++;
                remaining.add(sequence.size() / 2, "-" + moves + "a");
                System.out.println("Invalid input! Adding additional elements to the board");
            } else {
                moves++;
                String element1 = sequence.get(index1);
                String element2 = sequence.get(index2);
                if (element1.equals(element2)) {
                    remaining.remove(element1);
                    System.out.printf("Congrats! You have found matching elements - %s!%n", element1);
                } else {
                    System.out.println("Try again!");

                }
            }
            if (remaining.isEmpty()) {
                System.out.printf("You have won in %d turns!%n", moves);
                break;
            }
            command = scanner.nextLine();
        }
        for (String item : remaining) {
            System.out.print(item + " ");
        }
    }
}
