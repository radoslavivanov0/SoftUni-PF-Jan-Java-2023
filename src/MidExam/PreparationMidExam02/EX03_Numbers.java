package MidExam.PreparationMidExam02;

import java.util.*;
import java.util.stream.Collectors;

public class EX03_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> sequence = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int sum = 0;
        for (int item : sequence) {
            sum += item;
        }
        double average = 1.0 * sum / sequence.size();
        List<Integer> top5Numbers = new ArrayList<>();
        for (int currentNumber : sequence) {
            if (currentNumber > average) {
                top5Numbers.add(currentNumber);
            }
        }
        if (top5Numbers.isEmpty()) {
            System.out.println("No");
        } else if (top5Numbers.size() < 5) {
            Collections.sort(top5Numbers, Collections.reverseOrder());
            for (int number : top5Numbers) {
                System.out.print(number + " ");
            }
        } else if (top5Numbers.size() >= 5){
            Collections.sort(top5Numbers, Collections.reverseOrder());
            top5Numbers = top5Numbers.stream().limit(5).collect(Collectors.toList());
            for (int num : top5Numbers) {
                System.out.print(num + " ");
            }
        }

    }
}
