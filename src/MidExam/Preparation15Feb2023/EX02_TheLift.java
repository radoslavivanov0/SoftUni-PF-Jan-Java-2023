package MidExam.Preparation15Feb2023;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class EX02_TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int waitingPeople = Integer.parseInt(scanner.nextLine());
        int[] initialState = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] finalState = new int[initialState.length];
        for (int i = 0; i < initialState.length; i++) {
            if (initialState[i] < 4) {
                if (waitingPeople >= 4 - initialState[i]) {
                    waitingPeople -= 4 - initialState[i];
                    initialState[i] = 4;
                } else {
                    initialState[i] += waitingPeople;
                    waitingPeople = 0;
                }
            }
        }
        boolean full = IntStream.range(0, initialState.length).noneMatch(i -> initialState[i] != 4);
        if (waitingPeople == 0 && !full) {
            System.out.println("The lift has empty spots!");
        } else if (waitingPeople > 0 && full) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", waitingPeople);
        }
        System.out.print(Arrays.toString(initialState).replaceAll("[\\[\\]]", "").replaceAll(", ", " "));
    }
}