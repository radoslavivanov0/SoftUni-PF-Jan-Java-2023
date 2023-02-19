package MidExam.PreparationMidExamRetake06;

import java.util.Arrays;
import java.util.IllegalFormatCodePointException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EX03_ManOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> pirateShip = Arrays.stream(scanner.nextLine()
                .split(">"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> warShip = Arrays.stream(scanner.nextLine()
                .split(">"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int maximumHealthCapacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        while (!command.equals("Retire")) {
            String[] tokens = command.split("\\s+");
            if (tokens[0].equals("Fire")) {
                int index = Integer.parseInt(tokens[1]);
                int damage = Integer.parseInt(tokens[2]);
                if (index >= 0 && index <= warShip.size() - 1) {
                    int sectionHealth = warShip.get(index);
                    sectionHealth -= damage;
                    warShip.set(index, sectionHealth);
                    if (sectionHealth <= 0) {
                        System.out.println("You won! The enemy ship has sunken.");
                        return;
                    }
                }
            } else if (tokens[0].equals("Defend")) {
                int startIndex = Integer.parseInt(tokens[1]);
                int endIndex = Integer.parseInt(tokens[2]);
                int damage = Integer.parseInt(tokens[3]);
                if (startIndex >= 0 && startIndex <= pirateShip.size() - 1 && endIndex >= 0 && endIndex <= pirateShip.size() - 1) {
                    if (startIndex <= endIndex) {
                        for (int i = startIndex; i <= endIndex ; i++) {
                            int sectionHealth = pirateShip.get(i);
                            sectionHealth -= damage;
                            pirateShip.set(i, sectionHealth);
                            if (sectionHealth <= 0) {
                                System.out.println("You lost! The pirate ship has sunken.");
                                return;
                            }
                        }
                    }
                }
            } else if (tokens[0].equals("Repair")) {
                int index = Integer.parseInt(tokens[1]);
                int health = Integer.parseInt(tokens[2]);
                if (index >= 0 && index <= pirateShip.size() - 1) {
                    int sectionHealth = pirateShip.get(index);
                    sectionHealth += health;
                    if (sectionHealth < maximumHealthCapacity) {
                        pirateShip.set(index, sectionHealth);
                    }
                }
            } else if (tokens[0].equals("Status")) {
                int count = 0;
                for (int i = 0; i < pirateShip.size(); i++) {
                    int sectionHealth = pirateShip.get(i);
                    if (sectionHealth < (0.2 * maximumHealthCapacity)) {
                        count++;
                    }
                }
                System.out.printf("%d sections need repair.%n", count);
            }
            command = scanner.nextLine();
        }
        int pirateShipSum = 0;
        int warShipSum = 0;
        for (int i = 0; i < pirateShip.size(); i++) {
            pirateShipSum += pirateShip.get(i);
        }
        for (int i = 0; i < warShip.size() ; i++) {
            warShipSum += warShip.get(i);
        }
        System.out.printf("Pirate ship status: %d%n", pirateShipSum);
        System.out.printf("Warship status: %d%n", warShipSum);

    }
}
