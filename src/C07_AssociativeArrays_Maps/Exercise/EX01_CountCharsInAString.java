package C07_AssociativeArrays_Maps.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class EX01_CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Map<Character, Integer> characterCountsMap = new LinkedHashMap<>();
        for (char symbol : text.toCharArray()) {
            if (symbol == ' ') {
                continue;
            }
            if (characterCountsMap.containsKey(symbol)) {
                int currentCount = characterCountsMap.get(symbol);
                characterCountsMap.put(symbol, currentCount + 1);
            } else {
                characterCountsMap.put(symbol, 1);
            }
        }
//        for (Map.Entry<Character, Integer> entry : characterCountsMap.entrySet()) {
//            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
//        }
        characterCountsMap.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
