package C02_DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class EX07_WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine()); //the number of lines, which will follow
        int tankCapacity = 255;
        int totalPouredLiters = 0;
        for (int i = 1; i <= n ; i++) {
            int currentPouredLiters = Integer.parseInt(scanner.nextLine());
            totalPouredLiters += currentPouredLiters;
            if (totalPouredLiters > tankCapacity) {
                System.out.println("Insufficient capacity!");
                totalPouredLiters -= currentPouredLiters;
            }
        }
        System.out.println(totalPouredLiters);
    }
}
