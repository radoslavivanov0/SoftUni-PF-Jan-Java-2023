package C07_AssociativeArrays_Maps.MoreExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class EX02_Judge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Integer> contestListMap = new LinkedHashMap<>();
        while (!input.equals("no more time")){
            String[] usersDataArr = input.split(" -> ");
            String username = usersDataArr[0];
            String contest = usersDataArr[1];
            int points = Integer.parseInt(usersDataArr[2]);

            input = scanner.nextLine();
        }
    }
}
