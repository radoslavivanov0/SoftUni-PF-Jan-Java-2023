package C04_Methods.Lab;

import java.util.Scanner;

public class EX05_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        printTotalOrderPrice(product, quantity);
    }
    public static void printTotalOrderPrice(String product, int quantity) {
        switch (product) {
            case "coffee":
                System.out.printf("%.2f", 1.50 * quantity);
                break;
            case "water":
                System.out.printf("%.2f", 1.00 * quantity);
                break;
            case "coke":
                System.out.printf("%.2f", 1.40 * quantity);
                break;
            case "snacks":
                System.out.printf("%.2f", 2.00 * quantity);
                break;
        }
    }
}
