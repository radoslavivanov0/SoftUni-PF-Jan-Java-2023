package C05_Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EX01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listOfWagons = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacityEachWagon = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            if (command.contains("Add")) {
                int passengers = Integer.parseInt(command.split(" ")[1]);
                listOfWagons.add(passengers);
            } else {
                int passengers = Integer.parseInt(command);
                boolean added = false;
                for (int i = 0; i < listOfWagons.size(); i++) {
                    if (listOfWagons.get(i) + passengers <= maxCapacityEachWagon) {
                        listOfWagons.set(i, listOfWagons.get(i) + passengers);
                        added = true;
                        break;
                    }
                }
            }
            command = scanner.nextLine();
        }
        for (int wagon : listOfWagons) {
            System.out.print(wagon + " ");
        }
    }
}
