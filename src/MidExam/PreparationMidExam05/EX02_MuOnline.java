package MidExam.PreparationMidExam05;

import java.util.Scanner;

public class EX02_MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialHealth = 100;
        int initialBitcoins = 0;
        int bestRoom = 0;
        String[] dungeonRooms = scanner.nextLine().split("\\|");
        for (int i = 0; i <= dungeonRooms.length; i++) {
            String[] room = dungeonRooms[0].split("\\s+");
            String commandOrMonster = room[0];
            if (commandOrMonster.equals("potion")) {
                int healthAmount = Integer.parseInt(room[1]);
                initialHealth += healthAmount;
                if (initialBitcoins <= 100) {
                    System.out.printf("You healed for %d hp.%n", healthAmount);
                    System.out.printf("Current health: %d hp.%n", initialHealth);
                } else {
                    int healthBefore = initialHealth - healthAmount;
                    int newAmount = 100 - healthBefore;
                    initialHealth = 100;
                    System.out.printf("You healed for %d hp.%n", newAmount);
                    System.out.printf("Current health: %d hp.%n", initialHealth);
                }
            } else if (commandOrMonster.equals("chest")) {
                int bitcoinsAmount = Integer.parseInt(room[1]);
                int newBitcoins = initialBitcoins + bitcoinsAmount;
                initialBitcoins = newBitcoins;
                System.out.printf("You found {amount} bitcoins.%n");
            } else {
                int damage = Integer.parseInt(room[1]);
                initialHealth -= damage;
                if (initialHealth > 0) {
                    System.out.printf("You slayed %s.%n", commandOrMonster);
                } else {
                    System.out.printf("You died! Killed by %s.%n", commandOrMonster);
                    bestRoom = i + 1;
                    break;
                }
            }
        }
        if (bestRoom > 0) {
            System.out.printf("Best room: %d%n", bestRoom);
        } else {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", initialBitcoins);
            System.out.printf("Health: %d%n", initialHealth);
        }
    }
}
