package MidExam.MidExam_19Feb2023;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EX03_ChatLogger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> chatHistory = new ArrayList<>();
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] chat = command.split("\\s+");
            switch (chat[0]) {
                case "Chat":
                    String message = chat[1];
                    chatHistory.add(message);
                    break;
                case "Delete":
                    String messageToDelete = chat[1];
                    if (chatHistory.contains(messageToDelete)) {
                        chatHistory.remove(messageToDelete);
                    }
                    break;
                case "Edit":
                    String messageToEdit = chat[1];
                    String editedVersion = chat[2];
                    int messageIndex = chatHistory.indexOf(messageToEdit);
                    if (messageIndex != -1) {
                        chatHistory.set(messageIndex, editedVersion);
                    }
                    break;
                case "Pin":
                    String messageToPin = chat[1];
                    if (chatHistory.contains(messageToPin)) {
                        chatHistory.remove(messageToPin);
                        chatHistory.add(messageToPin);
                    }
                    break;
                case "Spam":
                    for (int i = 1; i < chat.length; i++) {
                        chatHistory.add(chat[i]);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (String message : chatHistory) {
            System.out.println(message);
        }
    }
}
