package C07_AssociativeArrays_Maps.MoreExercise;

import java.util.*;

public class EX01_Ranking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstInput = scanner.nextLine();
        Map<String, String> contestListMap = new LinkedHashMap<>();
        TreeMap<String, TreeMap<String, Integer>> usersListMap = new TreeMap<>();
        while (!firstInput.equals("end of contests")) {
            // "{contest}:{password for contest}"
            String contest = firstInput.split(":")[0];
            String passwordForContest = firstInput.split(":")[1];
            contestListMap.put(contest, passwordForContest);
            firstInput = scanner.nextLine();
        }


        String secondInput = scanner.nextLine();
        while (!secondInput.equals("end of submissions")) {
            // "{contest}=>{password}=>{username}=>{points}"
            String[] usersDataArr = secondInput.split("=>");
            String contest = usersDataArr[0];
            String password = usersDataArr[1];
            String username = usersDataArr[2];
            int points = Integer.parseInt(usersDataArr[3]);
            if (!contestListMap.containsKey(contest)) {
                secondInput = scanner.nextLine();
                continue;
            }
            if (!contestListMap.containsValue(password)) {
                secondInput = scanner.nextLine();
                continue;
            }
            if (!usersListMap.containsKey(username)) {
                usersListMap.put(username, new TreeMap<>());
                usersListMap.get(username).put(contest, points);
            } else {
                if (!usersListMap.get(username).containsKey(contest)) {
                    usersListMap.get(username).put(contest, points);
                } else {
                    if (usersListMap.get(username).get(contest) < points) {
                        usersListMap.get(username).put(contest, points);
                    }
                }
            }
            secondInput = scanner.nextLine();
        }
        int maxPoints = 0;
        String bestCandidate = "";
        for (Map.Entry<String, TreeMap<String, Integer>> entry : usersListMap.entrySet()) {
            int currentPoints = 0;
            for (Map.Entry<String, Integer> item : entry.getValue().entrySet()) {
                currentPoints += item.getValue();
            }
            if (currentPoints > maxPoints) {
                maxPoints = currentPoints;
                bestCandidate = entry.getKey();
            }
        }
        System.out.printf("Best candidate is %s with total %d points.%n", bestCandidate, maxPoints);
        System.out.println("Ranking: ");
        for (Map.Entry<String, TreeMap<String, Integer>> entry : usersListMap.entrySet()) {
            System.out.println(entry.getKey());
            Map<String, Integer> sortedMap = new LinkedHashMap<>();
            entry.getValue().entrySet().stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
            for (Map.Entry<String, Integer> item : sortedMap.entrySet()) {
                System.out.printf("#  %s -> %d%n", item.getKey(), item.getValue());
            }

        }


    }
}
