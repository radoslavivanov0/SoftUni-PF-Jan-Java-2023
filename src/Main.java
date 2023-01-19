public class Main {
    public static void main(String[] args) {
        String name = "Radoslav";
        // първа позиция 0, последна length - 1
//        System.out.println(name.length()); // брой символи
//        System.out.println(name.charAt(0)); //първа буква
//        System.out.println(name.charAt(name.length() - 1)); //последна буква
//        for (int position = 0; position <= name.length() - 1 ; position++) {
//
//        }
        char symbol = 'a';
        System.out.printf("The code of '%c' is: %d%n", symbol, (int) symbol);
        symbol = 'b';
        System.out.printf("The code of '%c' is: %d%n", symbol, (int) symbol);
        symbol = 'A';
        System.out.printf("The code of '%c' is: %d%n", symbol, (int) symbol);
        symbol = 'щ';  // Cyrillic letter 'sht'
        System.out.printf("The code of '%c' is: %d%n", symbol, (int) symbol);

    }
}