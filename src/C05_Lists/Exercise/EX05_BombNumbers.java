package C05_Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EX05_BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numberList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int[] numberArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int specialNumber = numberArr[0];
        int specialNumberPower = numberArr[1];
        while (numberList.contains(specialNumber)) {
            detonateNumbers(numberList, specialNumber, specialNumberPower);
        }
        int sum = 0;
        for (int numbers : numberList) {
            sum += numbers;
        }
        System.out.println(sum);
    }

    public static List<Integer> detonateNumbers(List<Integer> list, int special, int power) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == special) {
                int start = i - power;
                int end = i + power;
                if (start < 0) {
                    start = 0;
                }
                if (end > list.size() - 1) {
                    end = list.size() - 1;
                }
                list.subList(start, end + 1).clear();
            }
        }
        return list;
    }
}
