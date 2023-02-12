package C05_Lists.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       List<Integer> numbers =
               Arrays.stream(scanner.nextLine().split(" "))
                       .map(Integer::parseInt)
                       .collect(Collectors.toList());

       List<Double> decimalNumbers =
               Arrays.stream(scanner.nextLine().split(" "))
                       .map(Double::parseDouble)
                       .collect(Collectors.toList());

       List<String> names = Arrays.stream(scanner.nextLine().split(" "))
               .collect(Collectors.toList());

    decimalNumbers.subList(1, 4);
    }
}
