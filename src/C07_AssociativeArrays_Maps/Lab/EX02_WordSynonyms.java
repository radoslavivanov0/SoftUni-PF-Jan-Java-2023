package C07_AssociativeArrays_Maps.Lab;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class EX02_WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, ArrayList<String>> wordsMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();
//            if (!wordsMap.containsKey(word)) {
//                wordsMap.put(word, new ArrayList<>());
//            }
            wordsMap.putIfAbsent(word, new ArrayList<>());
            wordsMap.get(word).add(synonym);
        }
        for (Map.Entry<String, ArrayList<String>> entry : wordsMap.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", entry.getValue()));
        }

    }
}
