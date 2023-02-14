package MidExam.PreparationMidExam03Retake;

import java.util.Scanner;

public class EX01_CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int energy = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int countWonBattles = 0;
        while (!command.equals("End of battle")) {
            int distance = Integer.parseInt(command);
            if (energy >= distance)  {
                energy -= distance;
                countWonBattles++;
                if (countWonBattles % 3 == 0) {
                    energy += countWonBattles;
                }
            } else {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy%n", countWonBattles, energy);
                break;
            }
            command = scanner.nextLine();
        }
        if (command.equals("End of battle")) {
            System.out.printf("Won battles: %d. Energy left: %d%n", countWonBattles, energy);
        }
    }
}
