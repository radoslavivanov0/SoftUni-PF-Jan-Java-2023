package MidExam.Preparation15Feb2023;

import java.util.*;
import java.util.stream.Collectors;

public class EX03_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> sequence = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int sum = 0;
        for (int i = 0; i < sequence.size(); i++) {
            sum += sequence.get(i);
        }
        double averageValue = (double) sum / sequence.size();
        List<Integer> topFiveNumbers = new ArrayList<>();
        for (int i = 0; i < sequence.size(); i++) {
            if (sequence.get(i) > averageValue) {
                topFiveNumbers.add(sequence.get(i));
            }
        }
        if (topFiveNumbers.isEmpty()) {
            System.out.println("No");
        } else if (topFiveNumbers.size() < 5) {
            Collections.sort(topFiveNumbers);
            Collections.reverse(topFiveNumbers);
            for (int item : topFiveNumbers) {
                System.out.print(item + " ");
            }
        } else if (topFiveNumbers.size() >= 5) {
            Collections.sort(topFiveNumbers);
            Collections.reverse(topFiveNumbers);
            topFiveNumbers = topFiveNumbers.stream().limit(5).collect(Collectors.toList());
            for (int item : topFiveNumbers) {
                System.out.print(item + " ");
            }
        }
    }
}
