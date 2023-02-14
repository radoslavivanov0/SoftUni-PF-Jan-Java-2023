package MidExam.PreparationMidExam05;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class EX01_BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        int courseLectures = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());
        int countStudent = 0;
        double totalBonus = 0;
        int studentAttendance = Integer.MIN_VALUE;
        double maxBonus = Double.MIN_VALUE;
        for (int i = 1; i <= numberOfStudents; i++) {
            countStudent++;
            int currentStudentAttendance = Integer.parseInt(scanner.nextLine());
            double currentStudentBonus = Math.ceil((double) currentStudentAttendance / courseLectures * (5 + additionalBonus));
            if (currentStudentAttendance > studentAttendance) {
                studentAttendance = currentStudentAttendance;
            }
            if (currentStudentBonus > maxBonus) {
                maxBonus = currentStudentBonus;
            }
        }
        System.out.printf("Max Bonus: %.0f.%n", maxBonus);
        System.out.printf("The student has attended %d lectures.", studentAttendance);
    }
}
