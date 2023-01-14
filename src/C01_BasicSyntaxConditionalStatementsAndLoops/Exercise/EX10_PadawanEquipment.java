package C01_BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class EX10_PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amountMoney = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double sabresPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltsPrice = Double.parseDouble(scanner.nextLine());

        double calcSabresPrice = Math.ceil(studentsCount + (studentsCount * 0.10));
        double calcSabres = calcSabresPrice * sabresPrice;

        int freeBelts = studentsCount / 6;
        double calcBelts = (studentsCount - freeBelts) * beltsPrice;

        double calcRobes = robesPrice * studentsCount;

        double totalSum = calcSabres + calcRobes + calcBelts;

        if (totalSum <= amountMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalSum);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", Math.abs(totalSum - amountMoney));
        }
    }
}
