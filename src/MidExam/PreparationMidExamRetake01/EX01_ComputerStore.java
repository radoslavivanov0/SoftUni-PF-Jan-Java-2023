package MidExam.PreparationMidExamRetake01;

import java.util.Scanner;

public class EX01_ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        double totalPrice = 0;
        while (!command.equals("special") && !command.equals("regular")) {
            double partPrice = Double.parseDouble(command);
            if (partPrice < 0) {
                System.out.println("Invalid price!");
            } else {
                totalPrice += partPrice;
            }
            command = scanner.nextLine();
        }
        switch (command) {
            case "special":
                if (totalPrice == 0) {
                    System.out.println("Invalid order!");
                } else {
                    double taxes = totalPrice * 0.2;
                    double finalPrice = totalPrice + taxes;
                    double discountedPrice = finalPrice - (finalPrice * 0.10);
                    System.out.println("Congratulations you've just bought a new computer!");
                    System.out.printf("Price without taxes: %.2f$%n", totalPrice);
                    System.out.printf("Taxes: %.2f$%n", taxes);
                    System.out.println("-----------");
                    System.out.printf("Total price: %.2f$%n", discountedPrice);
                }
                break;
            case "regular":
                if (totalPrice == 0) {
                    System.out.println("Invalid order!");
                } else {
                    double taxes = totalPrice * 0.2;
                    double finalPrice = totalPrice + taxes;
                    System.out.println("Congratulations you've just bought a new computer!");
                    System.out.printf("Price without taxes: %.2f$%n", totalPrice);
                    System.out.printf("Taxes: %.2f$%n", taxes);
                    System.out.println("-----------");
                    System.out.printf("Total price: %.2f$%n", finalPrice);
                }
                break;
        }

    }
}
