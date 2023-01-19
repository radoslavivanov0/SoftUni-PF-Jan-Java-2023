package C02_DataTypesAndVariables.Exercise;

import java.math.BigDecimal;
import java.util.Scanner;

public class EX08_BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countBeerKegs = Integer.parseInt(scanner.nextLine());
        String biggestBeerKeg = "";
        double biggestKegVolume = 0;
        for (int i = 1; i <= countBeerKegs ; i++) {
            String currentModelBeerKeg = scanner.nextLine();
            double currentBeerKegRadius = Double.parseDouble(scanner.nextLine());
            double currentBeerKegHeight = Double.parseDouble(scanner.nextLine());
            double currentBeerKegVolume = Math.PI * currentBeerKegRadius * currentBeerKegRadius * currentBeerKegHeight;
            if (currentBeerKegVolume > biggestKegVolume) {
                biggestKegVolume = currentBeerKegVolume;
                biggestBeerKeg = currentModelBeerKeg;
            }
        }
        System.out.println(biggestBeerKeg);
    }
}
