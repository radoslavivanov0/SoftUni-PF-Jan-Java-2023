package C07_AssociativeArrays_Maps.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class EX04_SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> registeredUsers = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(" ");
            String command = data[0];
            String username = "";
            switch (command) {
                case "register":
                    username = data[1];
                    String licensePlateNumber = data[2];
                    if (registeredUsers.containsKey(username)) {
                        System.out.printf("ERROR: already registered with plate number %s%n", licensePlateNumber);
                    } else {
                        registeredUsers.put(username, licensePlateNumber);
                        System.out.printf("%s registered %s successfully%n", username, licensePlateNumber);
                    }
                    break;
                case "unregister":
                    username = data[1];
                    if (!registeredUsers.containsKey(username)) {
                        System.out.printf("ERROR: user %s not found%n", username);
                    } else {
                        registeredUsers.remove(username);
                        System.out.printf("%s unregistered successfully%n", username);
                    }
                    break;
            }
        }
        for (Map.Entry<String, String> user : registeredUsers.entrySet()) {
            System.out.println(user.getKey() + " => " + user.getValue());
        }

    }
}
