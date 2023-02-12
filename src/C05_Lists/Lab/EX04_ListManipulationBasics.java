package C05_Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EX04_ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] action = command.split(" ");
            int number = 0;
            int index = 0;
            switch (action[0]) {
                case "Add":
                    number = Integer.parseInt(action[1]);
                    numbers.add(number);
                    break;
                case "Remove":
                    number = Integer.parseInt(action[1]);
                    numbers.remove(Integer.valueOf(number));
                    break;
                case "RemoveAt":
                    index = Integer.parseInt(action[1]);
                    numbers.remove(index);
                    break;
                case "Insert":
                    number = Integer.parseInt(action[1]);
                    index = Integer.parseInt(action[2]);
                    numbers.add(index, number);
                    break;
            }

//            if (command.contains("Add")) {
//                int elementToAdd = Integer.parseInt(command.split(" ")[1]);
//                numbers.add(elementToAdd);
//            } else if (command.contains("Remove")) {
//                int elementToRemove = Integer.parseInt(command.split(" ")[1]);
//                numbers.remove(Integer.valueOf(elementToRemove));
//            } else if (command.contains("RemoveAt")) {
//                int indexToRemove = Integer.parseInt(command.split(" ")[1]);
//                numbers.remove(indexToRemove);
//            } else if (command.contains("Insert")) {
//                String[] commandParts = command.split(" ");
//                int number = Integer.parseInt(commandParts[1]);
//                int index = Integer.parseInt(commandParts[2]);
//                numbers.add(index, number);
//            }
            command = scanner.nextLine();
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
