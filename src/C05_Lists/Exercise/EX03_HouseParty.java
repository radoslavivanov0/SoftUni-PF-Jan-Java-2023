package C05_Lists.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EX03_HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countCommands = Integer.parseInt(scanner.nextLine());
        List<String> guests = new ArrayList<>();
        for (int i = 1; i <= countCommands ; i++) {
            String command = scanner.nextLine();
            if (command.contains("is going!")) {
                String name = command.split(" ")[0];
                if (guests.contains(name)) {
                    System.out.println(name + " is already in the list!");
                } else {
                    guests.add(name);
                }
            } else if (command.contains("is not going!")) {
                String name = command.split(" ")[0];
                if (guests.contains(name)) {
                    guests.remove(name);
                } else {
                    System.out.println(name + " is not in the list!");
                }
            }
        }
        for (String name : guests) {
            System.out.println(name);
        }
    }
}
