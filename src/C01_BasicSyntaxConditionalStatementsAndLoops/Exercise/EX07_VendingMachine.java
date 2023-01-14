package C01_BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class EX07_VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        double totalCoinsInserted = 0.0;
        int coinsInsertedCounter = 0;
        while (!command.equals("Start")) {
            double coins = Double.parseDouble(command);
            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                coinsInsertedCounter++;
                totalCoinsInserted += coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }
            command = scanner.nextLine();
        }
        String nextCommand = scanner.nextLine();
        double priceProduct = 0.0;
        String productName = "";
        double change = totalCoinsInserted;
        while (!nextCommand.equals("End")) {
            String product = nextCommand;
            switch (product) {
                case "Nuts":
                    productName = "Nuts";
                    priceProduct = 2.0;
                    if (change >= priceProduct) {
                        change -= priceProduct;
                        System.out.printf("Purchased %s%n", productName);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    productName = "Water";
                    priceProduct = 0.7;
                    if (change >= priceProduct) {
                        change -= priceProduct;
                        System.out.printf("Purchased %s%n", productName);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    productName = "Crisps";
                    priceProduct = 1.5;
                    if (change >= priceProduct) {
                        change -= priceProduct;
                        System.out.printf("Purchased %s%n", productName);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    productName = "Soda";
                    priceProduct = 0.8;
                    if (change >= priceProduct) {
                        change -= priceProduct;
                        System.out.printf("Purchased %s%n", productName);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    productName = "Coke";
                    priceProduct = 1.0;
                    if (change >= priceProduct) {
                        change -= priceProduct;
                        System.out.printf("Purchased %s%n", productName);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            nextCommand = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", change);
    }
}
