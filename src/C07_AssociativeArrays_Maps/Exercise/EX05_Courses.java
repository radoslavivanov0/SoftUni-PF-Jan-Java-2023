package C07_AssociativeArrays_Maps.Exercise;

import java.util.*;

public class EX05_Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        Map<String, List<String>> coursesMap = new LinkedHashMap<>();
        while (!command.equals("end")) {
            String courseName = command.split(" : ")[0];
            String studentName = command.split(" : ")[1];
            if (!coursesMap.containsKey(courseName)) {
                coursesMap.put(courseName, new ArrayList<>());
            }
            coursesMap.get(courseName).add(studentName);
            command = scanner.nextLine();
        }
        coursesMap.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + ": " + entry.getValue().size());
            entry.getValue().forEach(studentName -> System.out.println("-- " + studentName));
        });
    }
}
