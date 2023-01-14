package C01_BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class EX03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupNumber = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String day = scanner.nextLine();
        double unitPrice = 0.0;
        double totalPrice = 0.0;
        switch (groupType) {
            case "Students":
                switch (day) {
                    case "Friday":
                        unitPrice = 8.45;
                        totalPrice = unitPrice * groupNumber;
                        break;
                    case "Saturday":
                        unitPrice = 9.80;
                        totalPrice = unitPrice * groupNumber;
                        break;
                    case "Sunday":
                        unitPrice = 10.46;
                        totalPrice = unitPrice * groupNumber;
                        break;
                }
                if (groupNumber >= 30) {
                    totalPrice = totalPrice - (totalPrice * 0.15);
                }
                break;
            case "Business":
                switch (day) {
                    case "Friday":
                        unitPrice = 10.90;
                        if (groupNumber >= 100) {
                            totalPrice = (groupNumber - 10) * unitPrice;
                        } else {
                            totalPrice = groupNumber * unitPrice;
                        }
                        break;
                    case "Saturday":
                        unitPrice = 15.60;
                        if (groupNumber >= 100) {
                            totalPrice = (groupNumber - 10) * unitPrice;
                        } else {
                            totalPrice = groupNumber * unitPrice;
                        }
                        break;
                    case "Sunday":
                        unitPrice = 16;
                        if (groupNumber >= 100) {
                            totalPrice = (groupNumber - 10) * unitPrice;
                        } else {
                            totalPrice = groupNumber * unitPrice;
                        }
                        break;
                }
                break;
            case "Regular":
                switch (day) {
                    case "Friday":
                        unitPrice = 15;
                        totalPrice = unitPrice * groupNumber;
                        break;
                    case "Saturday":
                        unitPrice = 20;
                        totalPrice = unitPrice * groupNumber;
                        break;
                    case "Sunday":
                        unitPrice = 22.50;
                        totalPrice = unitPrice * groupNumber;
                        break;
                }
                if (groupNumber >= 10 && groupNumber <= 20) {
                    totalPrice = totalPrice - (totalPrice * 0.05);
                }
                break;
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
