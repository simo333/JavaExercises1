package pl.coderslab.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main04 {

    public static void main(String[] args) {
        findStringInLine();

    }

    private static void findStringInLine() {
        File file = new File("text4.txt");
        StringBuilder text = new StringBuilder();

        try (Scanner scan = new Scanner(file)) {
            while (scan.hasNextLine()) {
                text.append(scan.nextLine()).append('\n');
            }
        } catch (FileNotFoundException e) {
            System.out.println("Nie ma takiego pliku.");
        }

        String[] strings = text.toString().split("\n");
        for (String string : strings) {
            if (string.contains("Javy") || string.contains("javy")) {
                System.out.println(string);
            }
        }
    }
}
