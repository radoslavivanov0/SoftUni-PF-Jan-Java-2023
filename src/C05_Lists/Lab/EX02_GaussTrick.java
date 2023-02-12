package C05_Lists.Lab;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EX02_GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        for (int i = 0; i < numbersList.size() / 2; i++) {
            int firstNumber = numbersList.get(i);
            int secondNumber = numbersList.get(numbersList.size() - 1);
            numbersList.set(i, firstNumber + secondNumber);
            numbersList.remove(numbersList.size() - 1);
        }
        for (int element : numbersList) {
            System.out.print(element + " ");
        }
    }
}
