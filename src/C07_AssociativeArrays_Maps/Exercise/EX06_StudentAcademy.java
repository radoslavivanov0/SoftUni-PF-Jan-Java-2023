package C07_AssociativeArrays_Maps.Exercise;

import java.util.*;

public class EX06_StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Double>> studentsGradesMap = new LinkedHashMap<>();
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < countOfStudents; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            if (!studentsGradesMap.containsKey(name)) {
                studentsGradesMap.put(name, new ArrayList<>());
            }
            studentsGradesMap.get(name).add(grade);
        }
        Map<String, Double> studentsAverageGradeMap = new LinkedHashMap<>();
        for (Map.Entry<String, List<Double>> entry : studentsGradesMap.entrySet()) {
            String name = entry.getKey();
            List<Double> grades = entry.getValue();
            double averageGrade = getAverageGrade(grades);
            if (averageGrade >= 4.50) {
                studentsAverageGradeMap.put(name, averageGrade);
            }
        }
        for (Map.Entry<String, Double> entry : studentsAverageGradeMap.entrySet()) {
            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());
        }

    }

    private static double getAverageGrade(List<Double> grades) {
        double sumGrades = 0;
        for (double grade : grades) {
            sumGrades += grade;
        }
        return sumGrades / grades.size();
    }
}
