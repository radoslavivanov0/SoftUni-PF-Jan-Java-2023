package C03_Arrays.MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EX05_KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthOfSequences = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int bestSumOfOnes = 1;
        int bestLength = 1;
        int bestLeftIndex = 1;
        int[] bestSequence = new int[lengthOfSequences];
        int sequenceCounter = 0;
        int bestCounter = 0;
        while (!command.equals("Clone them!")) {
            int[] sampleSequenceArr = Arrays.stream(command.split("!+")).mapToInt(e -> Integer.parseInt(e)).toArray();
            sequenceCounter++;
            int sumOfOnes = 1;
            int onesLength = 1;
            int biggerLength = 1;
            int startIndex = 0;
            for (int i = 0; i < sampleSequenceArr.length - 1; i++) {
                int endIndex = 0;
                if (i == sampleSequenceArr.length - 2 && sampleSequenceArr[i + 1] == 0) {
                    sumOfOnes--;
                }
                if (sampleSequenceArr[i] == 1) {
                    sumOfOnes++;
                    if (sampleSequenceArr[i + 1] == 1) {
                        onesLength++;
                        endIndex = i + 1;
                        startIndex = endIndex - onesLength + 1;
                        if (onesLength > biggerLength) {
                            biggerLength = onesLength;
                        }
                    }
                } else {
                    onesLength = 1;
                }
            }
            if (biggerLength > bestLength) {
                bestLength = biggerLength;
                bestLeftIndex = startIndex;
                bestSumOfOnes = sumOfOnes;
                bestSequence = sampleSequenceArr;
                bestCounter = sequenceCounter;
            } else if (biggerLength == bestLength) {
                 if (startIndex < bestLeftIndex) {
                     bestLeftIndex = startIndex;
                     bestSumOfOnes = sumOfOnes;
                     bestSequence = sampleSequenceArr;
                     bestCounter = sequenceCounter;
                 } else if (startIndex == bestLeftIndex) {
                     if (sumOfOnes > bestSumOfOnes) {
                         bestSumOfOnes = sumOfOnes;
                         bestSequence = sampleSequenceArr;
                         bestCounter = sequenceCounter;
                     }
                 }
            }
            command = scanner.nextLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", bestCounter, bestSumOfOnes);
        for (int index : bestSequence) {
            System.out.print(index + " ");
        }
    }
}
