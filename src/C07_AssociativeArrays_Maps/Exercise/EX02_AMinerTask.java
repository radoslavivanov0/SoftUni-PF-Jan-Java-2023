package C07_AssociativeArrays_Maps.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class EX02_AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> resourcesQuantityMap = new LinkedHashMap<>();
        String resource = scanner.nextLine();
        while (!resource.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());
            if (!resourcesQuantityMap.containsKey(resource)) {
                resourcesQuantityMap.put(resource, quantity);
            } else {
                int currentQuantity = resourcesQuantityMap.get(resource);
                resourcesQuantityMap.put(resource, currentQuantity + quantity);
            }
            resource = scanner.nextLine();
        }
//        resourcesQuantityMap.forEach((key, value) -> System.out.println(key + " -> " + value));
        for (Map.Entry<String, Integer> entry : resourcesQuantityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
