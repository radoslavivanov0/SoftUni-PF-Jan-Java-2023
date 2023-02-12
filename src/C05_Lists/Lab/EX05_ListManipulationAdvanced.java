package C05_Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EX05_ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            if (command.startsWith("Contains")) {
                int numberToCheck = Integer.parseInt(command.split(" ")[1]);
                printContains(numbersList, numberToCheck);
            } else if (command.equals("Print even")) {
                printEvenNumbers(numbersList);
            } else if (command.equals("Print odd")) {
                printOddNumbers(numbersList);
            } else if (command.equals("Get sum")) {
                printGetSum(numbersList);
            } else if (command.startsWith("Filter")) {
                String condition = command.split(" ")[1];
                int numberToFilter = Integer.parseInt(command.split(" ")[2]);
                printFilteredNumbers(numbersList, condition, numberToFilter);
            }
            command = scanner.nextLine();
        }
    }

    public static void printContains(List<Integer> numbersList, int numberToCheck) {
        if (numbersList.contains(numberToCheck)) {
            System.out.println("Yes");
        } else {
            System.out.println("No such number");
        }
    }
    public static void printFilteredNumbers(List<Integer> numbersList, String condition, int numberToFilter) {
        switch (condition) {
            case "<":
                for (int number : numbersList) {
                    if (number < numberToFilter) {
                        System.out.print(number + " ");
                    }
                }
                System.out.println();
                break;
            case ">":
                for (int number : numbersList) {
                    if (number > numberToFilter) {
                        System.out.print(number + " ");
                    }
                }
                System.out.println();
                break;
            case ">=":
                for (int number : numbersList) {
                    if (number >= numberToFilter) {
                        System.out.print(number + " ");
                    }
                }
                System.out.println();
                break;
            case "<=":
                for (int number : numbersList) {
                    if (number <= numberToFilter) {
                        System.out.print(number + " ");
                    }
                }
                System.out.println();
                break;
        }
    }

    public static void printEvenNumbers(List<Integer> numbersList) {
        for (int number : numbersList) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
    public static void printOddNumbers(List<Integer> numbersList) {
        for (int number : numbersList) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
    public static void printGetSum(List<Integer> numbersList) {
        int sum = 0;
        for (int number : numbersList) {
            sum += number;
        }
        System.out.println(sum);
    }
}
