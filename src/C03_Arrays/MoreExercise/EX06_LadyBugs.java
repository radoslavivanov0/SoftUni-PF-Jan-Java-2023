package C03_Arrays.MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EX06_LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfField = Integer.parseInt(scanner.nextLine());
        int[] bugsArr = new int[sizeOfField];
        Arrays.fill(bugsArr, 0);
        int[] indexOfLadyBugs = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        for (int indexes : indexOfLadyBugs) {
            if (indexes < 0 || indexes >= bugsArr.length) {
                continue;
            } else {
                bugsArr[indexes] = 1;
            }
        }

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] indexesToMove = command.split(" ");
            int ladyBugIndex = Integer.parseInt(indexesToMove[0]);
            String direction = indexesToMove[1];
            int flyLength = Integer.parseInt(indexesToMove[2]);
            int newLadyBugIndex = 0;

            if (flyLength < 0) {
                if (direction.equals("left")) {
                    direction = "right";
                    flyLength = Math.abs(flyLength);
                } else if (direction.equals("right")) {
                    direction = "left";
                    flyLength = Math.abs(flyLength);
                }
            }

            if (ladyBugIndex < 0 || ladyBugIndex >= bugsArr.length || bugsArr[ladyBugIndex] == 0) {
                command = scanner.nextLine();
                continue;
            } else if (flyLength == 0 && ladyBugIndex <= bugsArr.length - 1) {
                if (bugsArr[ladyBugIndex] == 1) {
                    bugsArr[ladyBugIndex] = 0;
                }
            }

            switch (direction) {
                case "right":
                    newLadyBugIndex = ladyBugIndex + flyLength;
                    bugsArr[ladyBugIndex] = 0;
                    if (newLadyBugIndex > bugsArr.length - 1) {
                        bugsArr[ladyBugIndex] = 0;
                        break;
                    } else {
                        for (int i = newLadyBugIndex; i < bugsArr.length; i += flyLength) {
                            if (bugsArr[i] == 0) {
                                bugsArr[i] = 1;
                                break;
                            }
                        }
                    }
                    break;
                case "left":
                    newLadyBugIndex = ladyBugIndex - flyLength;
                    bugsArr[ladyBugIndex] = 0;
                    if (newLadyBugIndex < 0) {
                        bugsArr[ladyBugIndex] = 0;
                        break;
                    } else {
                        for (int i = newLadyBugIndex; i >= 0; i -= flyLength) {
                            if (bugsArr[i] == 0) {
                                bugsArr[i] = 1;
                                break;
                            }
                        }
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        Arrays.stream(bugsArr).forEach(item -> System.out.print(item + " "));
    }
}
