package C05_Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EX06_CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstPlayerCards = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondPlayerCards = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        while (!(firstPlayerCards.size() < 1) && !(secondPlayerCards.size() < 1)) {
            if (firstPlayerCards.get(0) > secondPlayerCards.get(0)) {
                int firstHand = firstPlayerCards.get(0);
                int secondHand = secondPlayerCards.get(0);
                secondPlayerCards.remove(0);
                firstPlayerCards.remove(0);
                firstPlayerCards.add(firstHand);
                firstPlayerCards.add(secondHand);
            } else if (secondPlayerCards.get(0) > firstPlayerCards.get(0)){
                int firstHand = firstPlayerCards.get(0);
                int secondHand = secondPlayerCards.get(0);
                firstPlayerCards.remove(0);
                secondPlayerCards.remove(0);
                secondPlayerCards.add(secondHand);
                secondPlayerCards.add(firstHand);
            } else {
                firstPlayerCards.remove(0);
                secondPlayerCards.remove(0);
            }
        }
        int sum = 0;
        if (firstPlayerCards.size() > secondPlayerCards.size()) {
            for (int card : firstPlayerCards) {
                sum += card;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        } else {
            for (int card : secondPlayerCards) {
                sum += card;
            }
            System.out.printf("Second player wins! Sum: %s", sum);
        }
    }
}
