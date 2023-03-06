package C07_AssociativeArrays_Maps.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class EX10_SoftUniExamResults_Optional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Integer> userAndPointsMap = new LinkedHashMap<>();
        Map<String, Integer> languageCountsMap = new LinkedHashMap<>();
        while (!input.equals("exam finished")) {
            String[] inputArr = input.split("-");
            String username = inputArr[0];

            if (input.contains("banned")) {
                userAndPointsMap.remove(username);
            } else {
                String language = inputArr[1];
                int points = Integer.parseInt(inputArr[2]);
                if (!userAndPointsMap.containsKey(username)) {
                    userAndPointsMap.put(username, points);
                } else {
                    int currentPoints = userAndPointsMap.get(username);
                    if (points > currentPoints) {
                        userAndPointsMap.put(username, points);
                    }
                }
                if (!languageCountsMap.containsKey(language)) {
                    languageCountsMap.put(language, 1);
                } else {
                    int currentCount = languageCountsMap.get(language);
                    languageCountsMap.put(language, currentCount + 1);
                }
            }
            input = scanner.nextLine();
        }
        System.out.println("Results:");
        userAndPointsMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + " | " + entry.getValue()));
        System.out.println("Submissions:");
        for (Map.Entry<String, Integer> entry : languageCountsMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
