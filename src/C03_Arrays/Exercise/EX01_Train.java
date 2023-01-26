package C03_Arrays.Exercise;

import java.util.Scanner;

public class EX01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfWagons = Integer.parseInt(scanner.nextLine());
        int[] train = new int[countOfWagons];
        int sumPeopleInTrain = 0;
        for (int i = 0; i < train.length; i++) {
            train[i] = Integer.parseInt(scanner.nextLine());
            sumPeopleInTrain += train[i];
            System.out.print(train[i] + " ");
        }
        System.out.println();
        System.out.println(sumPeopleInTrain);
    }
}
