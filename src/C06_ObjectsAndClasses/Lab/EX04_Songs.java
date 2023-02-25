package C06_ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EX04_Songs {
    static class Song {
        String typeList;
        String name;
        String time;
        public Song (String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }
        public String getName() {
            return this.name;
        }

        public String getTypeList() {
            return this.typeList;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Song> songsList = new ArrayList<>();
        for (int i = 1; i <= n ; i++) {
            String[] inputSongsArr = scanner.nextLine().split("_");
            String typeListInput = inputSongsArr[0];
            String nameInput = inputSongsArr[1];
            String timeInput = inputSongsArr[2];
            Song currentSong = new Song(typeListInput, nameInput, timeInput);
            songsList.add(currentSong);
        }
        String command = scanner.nextLine();
        if (command.equals("all")) {
            for (Song song : songsList) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song : songsList) {
                String currentTypeList = song.getTypeList();
                if (currentTypeList.equals(command)) {
                    System.out.println(song.getName());
                }
            }
        }
    }
}
