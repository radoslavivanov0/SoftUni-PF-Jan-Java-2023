package C07_AssociativeArrays_Maps.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class EX07_LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> materialsMap = new LinkedHashMap<>();
        materialsMap.put("shards", 0);
        materialsMap.put("fragments", 0);
        materialsMap.put("motes", 0);
        Map<String, Integer> junksMap = new LinkedHashMap<>();
        boolean isWin = false;
        while (!isWin) {
            String input = scanner.nextLine();
            String[] inputData = input.split("\\s+");
            for (int index = 0; index < inputData.length - 1; index += 2) {
                int quantity = Integer.parseInt(inputData[index]);
                String material = inputData[index + 1].toLowerCase();
                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    int currentQuantity = materialsMap.get(material);
                    materialsMap.put(material, currentQuantity + quantity);
                } else {
                    if (!junksMap.containsKey(material)) {
                        junksMap.put(material, quantity);
                    } else {
                        int currentQuantity = junksMap.get(material);
                        junksMap.put(material, currentQuantity + quantity);
                    }
                }
                if (materialsMap.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    materialsMap.put("shards", materialsMap.get("shards") - 250);
                    isWin = true;
                    break;
                } else if (materialsMap.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    materialsMap.put("fragments", materialsMap.get("fragments") - 250);
                    isWin = true;
                    break;
                } else if (materialsMap.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    materialsMap.put("motes", materialsMap.get("motes") - 250);
                    isWin = true;
                    break;
                }
            }
            if (isWin) {
                break;
            }
        }
        materialsMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
        junksMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
