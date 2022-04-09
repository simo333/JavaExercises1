package pl.coderslab.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main05 {

    public static void main(String[] args) {
        sortAndSaveFile();
    }

    private static void sortAndSaveFile() {
        File file = new File("text5.txt");
        StringBuilder text = new StringBuilder();

        try (Scanner scan = new Scanner(file)) {
            while (scan.hasNextLine()) {
                text.append(scan.nextLine()).append('\n');
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ten plik nie istnieje");
        }

        String[] strings = text.toString().split("\n");
        Arrays.sort(strings);
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
