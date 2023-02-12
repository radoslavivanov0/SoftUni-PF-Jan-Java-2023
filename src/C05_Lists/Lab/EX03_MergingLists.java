package C05_Lists.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EX03_MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> resultList = new ArrayList<>();
        int minSize = Math.min(firstList.size(), secondList.size());
        for (int i = 0; i < minSize; i++) {
            int firstNumber = firstList.get(i);
            int secondNumber = secondList.get(i);
            resultList.add(firstNumber);
            resultList.add(secondNumber);
        }
        if (firstList.size() > secondList.size()) {
            resultList.addAll(firstList.subList(minSize, firstList.size()));
        } else {
            resultList.addAll(secondList.subList(minSize, secondList.size()));
        }
        System.out.println(resultList.toString().replaceAll("[\\[\\],]",""));
    }
}
