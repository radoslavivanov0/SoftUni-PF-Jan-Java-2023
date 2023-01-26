package C03_Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class EX03_SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int sum = 0;
        for (int i = 0; i < numbersArr.length; i++) {
            int currentElement = numbersArr[i];
            if (currentElement % 2 == 0) {
                sum += currentElement;
            }
        }
        System.out.println(sum);
    }
}
