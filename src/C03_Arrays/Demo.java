package C03_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String inputLine = scanner.nextLine();
//
//        // "2" "8" "30" "25" "40" "72" "-2" "44" "56"
//        //  2   8   30   25   40   72   -2   44   56
//
//        String[] inputArr = inputLine.split(" ");
//
//        int[] numbersArr = new int[inputArr.length];
//        for (int i = 0; i < numbersArr.length; i++) {
//            numbersArr[i] = Integer.parseInt(inputArr[i]);
//        }
//
//        int[] numbersArr = Arrays
//                .stream(scanner.nextLine().split(" "))
//                .mapToInt(e -> Integer.parseInt(e))
//                .toArray();
//
//        for (int item : numbersArr) {
//            System.out.println(item);
//        }

//        int[] numbers = { 1, 2, 3, 4, 5 };
//        for (int number : numbers) {
//            System.out.println(number + " ");
//        }

        double[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToDouble(e -> Double.parseDouble(e))
                .toArray();

    }
}
