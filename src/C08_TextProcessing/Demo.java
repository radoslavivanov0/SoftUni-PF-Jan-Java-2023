package C08_TextProcessing;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        System.out.println(new Date());
        String text = "";
        for (int i = 0; i < 1000000; i++)
            text += "a";
        System.out.println(new Date());
    }
}
