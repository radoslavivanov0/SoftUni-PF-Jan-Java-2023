package C03_Arrays.Lab;

import java.util.Scanner;

public class EX01_DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = Integer.parseInt(scanner.nextLine());
        String[] daysOfWeekArr = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (day >= 1 && day <= 7) {
            System.out.println(daysOfWeekArr[day - 1]);
        } else {
            System.out.println("Invalid day!");
        }

    }
}