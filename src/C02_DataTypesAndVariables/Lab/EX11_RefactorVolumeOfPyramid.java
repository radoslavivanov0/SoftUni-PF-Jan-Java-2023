package C02_DataTypesAndVariables.Lab;

import java.util.Scanner;

public class EX11_RefactorVolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Length: ");
        Double length = Double.parseDouble(scanner.nextLine());
        System.out.print("Width: ");
        Double width = Double.parseDouble(scanner.nextLine());
        System.out.print("Height: ");
        Double height = Double.parseDouble(scanner.nextLine());
        Double pyramidVolume = (length * width * height) / 3;
        System.out.printf("Pyramid Volume: %.2f", pyramidVolume);
    }
}
