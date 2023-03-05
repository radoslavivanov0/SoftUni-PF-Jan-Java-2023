package C06_ObjectsAndClasses.Exercise.EX04_Students;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();
        int countStudents = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= countStudents; i++) {
            String data = scanner.nextLine();
            String firstName = data.split("\\s+")[0];
            String lastName = data.split("\\s+")[1];
            Double grade = Double.parseDouble(data.split("\\s+")[2]);
            Student student = new Student(firstName, lastName, grade);
            studentList.add(student);
        }
        studentList.sort(Comparator.comparing(Student::getGrade).reversed());
        for (Student student : studentList) {
            System.out.printf("%s %s: %.2f%n", student.getFirstName(), student.getLastName(), student.getGrade());
        }
    }
}
