package C07_AssociativeArrays_Maps.Exercise;

import java.util.*;

public class EX09_ForceBook_Optional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<String>> teamsMap = new LinkedHashMap<>();
        while (!input.equals("Lumpawaroo")) {
            if (input.contains("|")) {
                String team = input.split(" \\| ")[0]; // force_side
                String player = input.split("\\| ")[1]; // force_user
                if (!teamsMap.containsKey(team)) {
                    teamsMap.put(team, new ArrayList<>());
                }
                boolean isExist = false; // check if player exists in another team
                for (List<String> list : teamsMap.values()) {
                    if (list.contains(player)) {
                        isExist = true;
                    }
                }
                if (!isExist) {
                    teamsMap.get(team).add(player);
                }
            } else if (input.contains("->")) {
                String player = input.split(" -> ")[0]; // force_user
                String team = input.split(" -> ")[1]; // force_side
                teamsMap.entrySet().forEach(entry -> entry.getValue().remove(player));
                if (teamsMap.containsKey(team)) {
                    List<String> currentPlayers = teamsMap.get(team); // current player's team
                    currentPlayers.add(player); // add player to the new team
                } else {
                    teamsMap.put(team, new ArrayList<>());
                    teamsMap.get(team).add(player);
                }
                System.out.printf("%s joins the %s side!%n", player, team);
            }
            input = scanner.nextLine();
        }
        teamsMap.entrySet()
                .stream().filter(entry -> entry.getValue().size() > 0)
                .forEach(entry -> {
                    System.out.println("Side: " + entry.getKey() + ", Members: " + entry.getValue().size());
                    entry.getValue().forEach(player -> System.out.println("! " + player));
                });

    }

}
