package C01_BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class EX09_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOrders = Integer.parseInt(scanner.nextLine()); //count of orders shop will receive
        double orderPrice = 0.0;
        double totalPrice = 0.0;
        for (int order = 0; order < countOrders; order++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int daysInMonth = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());
            orderPrice = ((daysInMonth * capsulesCount) * pricePerCapsule);
            System.out.printf("The price for the coffee is: $%.2f%n", orderPrice);
            totalPrice += orderPrice;
        }
        System.out.printf("Total: $%.2f", totalPrice);
    }
}
