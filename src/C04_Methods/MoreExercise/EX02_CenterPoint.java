package C04_Methods.MoreExercise;

import java.util.Scanner;

public class EX02_CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());
        closestToCenter(x1, y1, x2, y2);
        // First Solution:
//        if (firstPoint(x1, y1) >= secondPoint(x2, y2)) {
//            System.out.printf("(%d, %d)", x2, y2);
//        } else {
//            System.out.printf("(%d, %d)", x1, y1);
//        }
//    }
//    public static int firstPoint(int x1, int y1) {
//        return Math.abs(x1 * y1);
//    }
//    public static int secondPoint(int x2, int y2) {
//        return Math.abs(x2 * y2);
//    }

        // Second solution

    }
    private static void closestToCenter(int x1, int y1, int x2, int y2) {
        // This method calculates the Euclidean distance between each point and the center (0, 0) using the Pythagorean theorem. The Euclidean distance is calculated as the square root of the sum of the squares of the x and y coordinates. The method then compares the distances and prints the point with the smaller distance.
        double distance1 = Math.sqrt(x1 * x1 + y1 * y1);
        double distance2 = Math.sqrt(x2 * x2 + y2 * y2);
        if (distance1 <= distance2) {
            System.out.printf("(%d, %d)", x1, y1);
        } else {
            System.out.printf("(%d, %d)", x2, y2);
        }
    }
}
