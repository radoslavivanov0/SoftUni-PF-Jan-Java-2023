package C06_ObjectsAndClasses.Exercise.EX02_Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArticle = scanner.nextLine().split(", ");
        Article article = new Article(inputArticle[0], inputArticle[1], inputArticle[2]);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n ; i++) {
            String command = scanner.nextLine();
            if (command.contains("Edit")) {
                article.edit(command.split(": ")[1]);
            } else if (command.contains("Rename")) {
                article.rename(command.split(": ")[1]);
            } else if (command.contains("ChangeAuthor")) {
                article.changeAuthor(command.split(": ")[1]);
            }
        }
        System.out.printf("%s - %s: %s", article.getTitle(), article.getContent(), article.getAuthor());
    }
}
