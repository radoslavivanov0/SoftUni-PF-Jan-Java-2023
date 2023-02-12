package C05_Lists.Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EX10_SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> courses = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("course start")) {
            String[] commandParts = command.split(":");
            String currentCommand = commandParts[0];
            if (currentCommand.contains("Add")) {
                String lessonTitle = commandParts[1];
                if (!courses.contains(lessonTitle)) {
                        courses.add(lessonTitle);
                }
            } else if (currentCommand.contains("Insert")) {
                String lessonTitle = commandParts[1];
                int index = Integer.parseInt(commandParts[2]);
                if (!courses.contains(lessonTitle)) {
                    courses.add(index, lessonTitle);
                }
            } else if (currentCommand.contains("Remove")) {
                String lessonTitle = commandParts[1];
                if (courses.contains(lessonTitle)) {
                    courses.removeAll(Arrays.asList(lessonTitle));
                }
            } else if (currentCommand.contains("Swap")) {
                String lessonTitle1 = commandParts[1];
                String lessonTitle2 = commandParts[2];
                boolean isExercised1 = courses.contains(lessonTitle1+"-Exercise");
                boolean isExercised2 = courses.contains(lessonTitle2+"-Exercise");
                int indexOfFirst = 0;
                int indexOfSecond = 0;
                if (courses.contains(lessonTitle1) && courses.contains(lessonTitle2)) {
                    for (int i = 0; i < courses.size(); i++) {
                        if (courses.get(i).equals(lessonTitle1)) {
                            indexOfFirst = i;
                        } else if (courses.get(i).equals(lessonTitle2)) {
                            indexOfSecond = i;
                        }
                    }
                    if (isExercised1) {
                        courses.set(indexOfFirst, lessonTitle2);
                        courses.set(indexOfSecond, lessonTitle1);
                        courses.add(indexOfSecond+1, lessonTitle1+"-Exercise");
                        courses.remove(indexOfFirst+2);
                    } else if (isExercised2) {
                        courses.set(indexOfSecond, lessonTitle1);
                        courses.set(indexOfFirst, lessonTitle2);
                        courses.add(indexOfFirst+1, lessonTitle2+"-Exercise");
                        courses.remove(indexOfSecond+2);
                    } else {
                        courses.set(indexOfSecond, lessonTitle1);
                        courses.set(indexOfFirst, lessonTitle2);
                    }
                }
            } else if (currentCommand.contains("Exercise")) {
                String lessonTitle = commandParts[1];
                String exercise = "-Exercise";
                if (!courses.contains(lessonTitle)) {
                    courses.add(lessonTitle);
                    courses.add(lessonTitle+exercise);
                } else if (courses.contains(lessonTitle+exercise)) {
                    command = scanner.nextLine();
                    continue;
                } else {
                    for (int i = 0; i < courses.size(); i++) {
                        if (courses.get(i).equals(lessonTitle)) {
                            lessonTitle = lessonTitle+exercise;
                            courses.add(i+1, lessonTitle);
                            break;
                        }
                    }
                }
            }
            command = scanner.nextLine();
        }
        for (int i = 1; i <= courses.size(); i++) {
            System.out.printf("%d.%s%n", i, courses.get(i - 1));
        }
    }
}
