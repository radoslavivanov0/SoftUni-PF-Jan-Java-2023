package C06_ObjectsAndClasses.Exercise.EX01_AdvertisementMessage;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Message message = new Message();
        int n = Integer.parseInt(scanner.nextLine());
        Random rndGenerator = new Random();
        for (int i = 0; i < n ; i++) {
            System.out.println(message.randomMessage());
        }
    }
}
