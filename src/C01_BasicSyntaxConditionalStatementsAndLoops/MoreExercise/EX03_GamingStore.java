package C01_BasicSyntaxConditionalStatementsAndLoops.MoreExercise;

import java.util.Scanner;

public class EX03_GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double currentBalance = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();
        double remainingMoney = currentBalance;
        String boughtGame = "";
        double priceGame = 0;
        while (!command.equals("Game Time")) {
            String currentGame = command;
            switch (currentGame) {
                case "OutFall 4":
                    priceGame = 39.99;
                    if (remainingMoney >= priceGame) {
                        remainingMoney -= priceGame;
                        boughtGame = "OutFall 4";
                        System.out.printf("Bought %s%n", boughtGame);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "CS: OG":
                    priceGame = 15.99;
                    if (remainingMoney >= priceGame) {
                        remainingMoney -= priceGame;
                        boughtGame = "CS: OG";
                        System.out.printf("Bought %s%n", boughtGame);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Zplinter Zell":
                    priceGame = 19.99;
                    if (remainingMoney >= priceGame) {
                        remainingMoney -= priceGame;
                        boughtGame = "Zplinter Zell";
                        System.out.printf("Bought %s%n", boughtGame);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Honored 2":
                    priceGame = 59.99;
                    if (remainingMoney >= priceGame) {
                        remainingMoney -= priceGame;
                        boughtGame = "Honored 2";
                        System.out.printf("Bought %s%n", boughtGame);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "RoverWatch":
                    priceGame = 29.99;
                    if (remainingMoney >= priceGame) {
                        remainingMoney -= priceGame;
                        boughtGame = "RoverWatch";
                        System.out.printf("Bought %s%n", boughtGame);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "RoverWatch Origins Edition":
                    priceGame = 39.99;
                    if (remainingMoney >= priceGame) {
                        remainingMoney -= priceGame;
                        boughtGame = "RoverWatch Origins Edition";
                        System.out.printf("Bought %s%n", boughtGame);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }
            command = scanner.nextLine();
        }
        double totalSpentMoney = currentBalance - remainingMoney;
        if (remainingMoney == 0) {
            System.out.println("Out of money!");
        } else {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpentMoney, remainingMoney);
        }
    }
}
