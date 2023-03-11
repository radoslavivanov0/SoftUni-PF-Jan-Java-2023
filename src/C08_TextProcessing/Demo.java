package C08_TextProcessing;

import java.util.Date;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println(new Date());
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            text.append("a");
        }
        System.out.println(new Date());
    }
}
