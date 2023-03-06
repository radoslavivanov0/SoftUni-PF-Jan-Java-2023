package C07_AssociativeArrays_Maps.Lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class EX01_CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbersArr = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();
        TreeMap<Double, Integer> countMap = new TreeMap<>();
        for (double num : numbersArr) {
            if (!countMap.containsKey(num)) {
                countMap.put(num, 0);
            }
            countMap.put(num, countMap.get(num) + 1);

//            if (!countMap.containsKey(num)) {
//                countMap.put(num, 1);
//            } else {
//                int value = countMap.get(num);
//                countMap.put(num, value + 1);
//            }
        }
        for (Map.Entry<Double, Integer> entry : countMap.entrySet()) {
            DecimalFormat df = new DecimalFormat("#.######");
            double num = entry.getKey();
            System.out.printf("%s -> %d%n", df.format(num), entry.getValue());
        }

    }
}
