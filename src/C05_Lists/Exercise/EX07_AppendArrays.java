package C05_Lists.Exercise;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EX07_AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\|");
        List<String> output = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            String[] currentArray = input[i].split("\\s+");
            for (int j = currentArray.length - 1; j >= 0 ; j--) {
                if (!currentArray[j].equals("")){
                    output.add(0, currentArray[j]);
                }
            }
        }
        output.forEach(e -> System.out.print(e + " "));

//        List<String> input = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
//        List<String> output = new ArrayList<>();
//        for (int i = 0; i < input.size(); i++) {
//            String currentItem = input.get(i);
//            if (currentItem.contains(" ")) {
//                currentItem = currentItem.replaceAll("\\s+", "");
//            }
//            for (int j = currentItem.length() - 1; j >= 0 ; j--) {
//                output.add(0, String.valueOf(currentItem.charAt(j)));
//            }
////        }
//        for (String item : output) {
//            System.out.print(item + " ");
//        }
    }
}
