package MidExam.Preparation15Feb2023;

import java.util.Scanner;

public class EX01_BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int dailyPlunder = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());
        double totalPlunder = 0;
        int countPlunder = 0;
        for (int i = 1; i <= days ; i++) {
            totalPlunder += dailyPlunder;
            countPlunder++;
            if (countPlunder % 3 == 0) {
                totalPlunder += dailyPlunder * 0.50;
            }
            if (countPlunder % 5 == 0) {
                totalPlunder -= totalPlunder * 0.30;
            }
        }
        if (totalPlunder >= expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.", totalPlunder);
        } else {
            double percentage = (totalPlunder / expectedPlunder) * 100;
            System.out.printf("Collected only %.2f%% of the plunder.", percentage);
        }
    }
}
