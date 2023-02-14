package MidExam.PreparationMidExam02;

import java.util.Scanner;

public class EX01_SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // employeeEfficiency -> number of students an employee can help per hour
        int firstEmployeeEfficiency = Integer.parseInt(scanner.nextLine());
        int secondEmployeeEfficiency = Integer.parseInt(scanner.nextLine());
        int thirdEmployeeEfficiency = Integer.parseInt(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        int totalEfficiencyPerHour = firstEmployeeEfficiency + secondEmployeeEfficiency + thirdEmployeeEfficiency;
        int hoursNeeded = (int) Math.ceil((double) studentsCount / totalEfficiencyPerHour);
        int neededTime = hoursNeeded + (hoursNeeded - 1) / 3;
        System.out.printf("Time needed: %dh.%n", neededTime);
    }
}
