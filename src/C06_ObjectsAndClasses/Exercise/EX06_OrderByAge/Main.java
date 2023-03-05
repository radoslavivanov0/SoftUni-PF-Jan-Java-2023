package C06_ObjectsAndClasses.Exercise.EX06_OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] dataArr = input.split("\\s+");
            String name = dataArr[0];
            String ID = dataArr[1];
            int age = Integer.parseInt(dataArr[2]);
            Person person = new Person(name, ID, age);
            personList.add(person);
            input = scanner.nextLine();
        }
        personList.sort(Comparator.comparing(Person::getAge));
        for (Person person : personList) {
            System.out.printf("%s with ID: %s is %d years old.%n", person.getName(), person.getID(), person.getAge());
        }
    }
}
