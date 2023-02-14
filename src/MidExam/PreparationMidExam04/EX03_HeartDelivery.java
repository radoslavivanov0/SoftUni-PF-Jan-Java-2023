package MidExam.PreparationMidExam04;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EX03_HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> neighborhood = Arrays.stream(scanner.nextLine().split("@")).map(Integer::parseInt).collect(Collectors.toList());
        int index = 0;
        int lastIndex = 0;
        String command = scanner.nextLine();
        while (!command.equals("Love!")) {
            String[] commandParts = command.split(" ");
            int length = Integer.parseInt(commandParts[1]);
            index += length;
            if (index >= neighborhood.size()) {
                index = 0;
            }
            if (neighborhood.get(index) == 0) {
                System.out.printf("Place %d already had Valentine's day.%n", index);
            } else {
                int currentNeighborhood = neighborhood.get(index);
                neighborhood.set(index, currentNeighborhood - 2);
                if (neighborhood.get(index) == 0) {
                    System.out.printf("Place %d has Valentine's day.%n", index);
                }
            }
            lastIndex = index;
            command = scanner.nextLine();
        }
        System.out.printf("Cupid's last position was %d.%n", lastIndex);

        int houseCount = 0;
        for (int i = 0; i < neighborhood.size(); i++) {
            int current = neighborhood.get(i);
            if (current > 0) {
                houseCount++;
            }
        }
        if (houseCount > 0) {
            System.out.printf("Cupid has failed %d places.", houseCount);
        } else if (houseCount == 0) {
            System.out.println("Mission was successful.");
        }
    }
}
