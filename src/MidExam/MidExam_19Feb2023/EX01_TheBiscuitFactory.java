package MidExam.MidExam_19Feb2023;

import java.util.Scanner;

public class EX01_TheBiscuitFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfBiscuitsProducedPerDay = Integer.parseInt(scanner.nextLine());
        int countOfWorkers = Integer.parseInt(scanner.nextLine());
        int countOfBiscuitsCompetitor = Integer.parseInt(scanner.nextLine());
        int countBiscuits = 0;
        int counterDays = 0;
        for (int i = 1; i <= 30; i++) {
            counterDays++;
            if (counterDays % 3 == 0) {
                countBiscuits += Math.floor(((numberOfBiscuitsProducedPerDay * countOfWorkers) * 0.75));
            } else {
                countBiscuits += (numberOfBiscuitsProducedPerDay * countOfWorkers);
            }
        }
        System.out.printf("You have produced %d biscuits for the past month.%n", countBiscuits);
        int difference = Math.abs(countBiscuits - countOfBiscuitsCompetitor);
        double percentage = (double) difference / countOfBiscuitsCompetitor * 100;
        if (countBiscuits > countOfBiscuitsCompetitor) {
            System.out.printf("You produce %.2f percent more biscuits.%n", percentage);
        } else {
            System.out.printf("You produce %.2f percent less biscuits.%n", percentage);
        }
    }
}
