package MidExam.PreparationMidExamRetake01;

import java.util.Arrays;
import java.util.Scanner;

public class EX02_TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        int[] originalState = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] finalState = new int[originalState.length];
        for (int i = 0; i <= originalState.length ; i++) {
            if (originalState[i] < 4) {
                if (people >= 4 - originalState[i]) {
                    people -= 4 - originalState[i];
                    originalState[i] = 4;
                } else {
                    originalState[i] += people;
                    people = 0;
                }
            }
        }
    }
}
