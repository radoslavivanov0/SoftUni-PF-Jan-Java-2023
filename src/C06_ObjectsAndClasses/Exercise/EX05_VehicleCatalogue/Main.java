package C06_ObjectsAndClasses.Exercise.EX05_VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Vehicle> vehicleList = new ArrayList<>();
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] inputData = input.split(" ");
            String type = inputData[0];
            String model = inputData[1];
            String color = inputData[2];
            int horsePower = Integer.parseInt(inputData[3]);
            Vehicle vehicle = new Vehicle(type, model, color, horsePower);
            vehicleList.add(vehicle);
            input = scanner.nextLine();
        }
        String enteredModel = scanner.nextLine();
        while (!enteredModel.equals("Close the Catalogue")) {
            for (Vehicle vehicle : vehicleList) {
                if (enteredModel.equals(vehicle.getModel())) {
                    System.out.println(vehicle);
                    break;
                }
            }
            enteredModel = scanner.nextLine();
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n", getAverageHorsePower(vehicleList, "cars"));
        System.out.printf("Trucks have average horsepower of: %.2f.%n", getAverageHorsePower(vehicleList, "trucks"));
    }

    private static double getAverageHorsePower(List<Vehicle> vehicleList, String type) {
        double sum = 0;
        int count = 0;
        if (type.equals("cars")) {
            for (Vehicle vehicle : vehicleList) {
                if (vehicle.getType().equals("car")) {
                    sum += vehicle.getHorsePower();
                    count++;
                }
            }
        } else if (type.equals("trucks")) {
            for (Vehicle vehicle : vehicleList) {
                if (vehicle.getType().equals("truck")) {
                    sum += vehicle.getHorsePower();
                    count++;
                }
            }
        }
        if (sum == 0) {
            return 0;
        }
        return sum / count;
    }
}
