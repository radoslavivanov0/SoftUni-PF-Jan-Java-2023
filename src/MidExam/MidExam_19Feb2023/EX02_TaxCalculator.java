package MidExam.MidExam_19Feb2023;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Spliterator;

public class EX02_TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] vehiclesArr = scanner.nextLine().split(">>");
        double totalTax = 0.0;
        for (String vehicle : vehiclesArr) {
            String[] vehicleData = vehicle.split("\\s+");
            String vehicleType = vehicleData[0];
            int yearsInUse = Integer.parseInt(vehicleData[1]);
            int kilometersTravelled = Integer.parseInt(vehicleData[2]);
            double vehicleTax = 0.0;
            switch (vehicleType) {
                case "family":
                    vehicleTax = (50.0 - 5.0 * yearsInUse) + (12.0 * (Math.floor( (double) kilometersTravelled / 3000)));
                    totalTax += vehicleTax;
                    System.out.printf("A %s car will pay %.2f euros in taxes.%n", vehicleType, vehicleTax);
                    break;
                case "heavyDuty":
                    vehicleTax = (80.0 - 8.0 * yearsInUse) + (14.0 * (Math.floor( (double) kilometersTravelled / 9000)));
                    totalTax += vehicleTax;
                    System.out.printf("A %s car will pay %.2f euros in taxes.%n", vehicleType, vehicleTax);
                    break;
                case "sports":
                    vehicleTax = (100.0 - 9.0 * yearsInUse) + (18.0 * (Math.floor( (double) kilometersTravelled / 2000)));
                    totalTax += vehicleTax;
                    System.out.printf("A %s car will pay %.2f euros in taxes.%n", vehicleType, vehicleTax);
                    break;
                default:
                    System.out.println("Invalid car type.");
                    break;
            }
        }
        System.out.printf("The National Revenue Agency will collect %.2f euros in taxes.", totalTax);
    }
}
