package MidExam.PreparationMidExam04;

import java.util.Scanner;

public class EX01_GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double quantityFoodInKg = Double.parseDouble(scanner.nextLine());
        double quantityHayInKg = Double.parseDouble(scanner.nextLine());
        double quantityCoverInKg = Double.parseDouble(scanner.nextLine());
        double weightInKg = Double.parseDouble(scanner.nextLine());
        double qtyFoodInGrams = quantityFoodInKg * 1000;
            double qtyHayInGrams = quantityHayInKg * 1000;
        double qtyCoverInGrams = quantityCoverInKg * 1000;
        double weightInGrams = weightInKg * 1000;
        int counterDay = 0;
        double totalFood = qtyFoodInGrams;
        double totalHay = qtyHayInGrams;
        double totalCover = qtyCoverInGrams;
        for (int i = 1; i <= 30 ; i++) {
            counterDay++;
            totalFood -= 300;
            if (counterDay % 2 == 0) {
                totalHay -= totalFood * 0.05;
            }
            if (counterDay % 3 == 0) {
                totalCover -= (weightInGrams / 3);
            }
        }
        double excessFood = totalFood / 1000;
        double excessHay = totalHay / 1000;
        double excessCover = totalCover / 1000;
        if (excessFood <= quantityFoodInKg && excessFood > 0 && excessHay <= quantityHayInKg && excessHay > 0 && excessCover <= quantityCoverInKg && excessCover > 0) {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", excessFood, excessHay, excessCover);
        } else {
            System.out.println("Merry must go to the pet store!");
        }
    }
}
