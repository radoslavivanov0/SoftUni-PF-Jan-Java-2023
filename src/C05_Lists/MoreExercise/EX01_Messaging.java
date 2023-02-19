package C05_Lists.MoreExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EX01_Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<String> text = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .collect(Collectors.toList());

//        String messageInput = scanner.nextLine();
//        StringBuilder message = new StringBuilder();
//        for (int i = 0; i < messageInput.length(); i++) {
//            message.append(messageInput.charAt(i));
////        }
//        for (int i = 0; i < numbersList.size(); i++) {
//            int number = numbersList.get(i);
//            int sumDigits = getSumDigits(number);
//            char currCharacter;
//            if (sumDigits > message.length() - 1) {
//                sumDigits -= message.length();
//            }
//            currCharacter = message.charAt(sumDigits);
//            System.out.print(currCharacter);
//            message.deleteCharAt(sumDigits);
//        }
    }

    public static int getSumDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
