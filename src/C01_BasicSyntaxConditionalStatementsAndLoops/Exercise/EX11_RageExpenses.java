package C01_BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class EX11_RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());
        int countTrashedHeadsets = lostGamesCount / 2;
        int countTrashedMouse = lostGamesCount / 3;
        int countTrashedKeyboards = lostGamesCount / 6;
        int countTrashedDisplays = lostGamesCount / 12;
        double finalSum = (countTrashedHeadsets * headsetPrice) + (countTrashedMouse * mousePrice) + (countTrashedKeyboards * keyboardPrice) + (countTrashedDisplays * displayPrice);
        System.out.printf("Rage expenses: %.2f lv.", finalSum);
    }
}
