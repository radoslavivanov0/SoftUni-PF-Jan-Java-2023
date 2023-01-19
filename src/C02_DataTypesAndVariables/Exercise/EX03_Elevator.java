package C02_DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class EX03_Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        int capacityElevator = Integer.parseInt(scanner.nextLine());
        int courses = (int) Math.ceil((double) people / capacityElevator);
        System.out.println(courses);
    }
}
