package MidExam.Preparation13Feb2023;

import java.util.Scanner;

public class EX01_CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialEnergy = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int countWins = 0;
        while (!command.equals("End of battle")) {
            int distance = Integer.parseInt(command);
            if (initialEnergy >= distance) {
                initialEnergy -= distance;
                countWins++;
                int currentWins = countWins;
                if (countWins % 3 == 0) {
                    initialEnergy += currentWins;
                }
            } else {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", countWins, initialEnergy);
                break;
            }
            command = scanner.nextLine();
        }
        if (command.equals("End of battle")) {
            System.out.printf("Won battles: %d. Energy left: %d", countWins, initialEnergy);
        }
    }
}
