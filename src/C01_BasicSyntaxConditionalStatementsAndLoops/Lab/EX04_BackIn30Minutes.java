package C01_BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class EX04_BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int hourToMinutes = hours * 60;
        int totalMinutes = hourToMinutes + minutes + 30;
        int hour = totalMinutes / 60;
        int minute = totalMinutes % 60;
        if (minute > 59) {
            hour += 1;
            minute -= 60;
        }
        if (hour > 23) {
            hour = 0;
        }
        System.out.printf("%d:%02d", hour, minute);
    }
}
