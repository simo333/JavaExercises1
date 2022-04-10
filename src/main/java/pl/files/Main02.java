package pl.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {
        readFromFile();

    }

    private static void readFromFile() {
        File file = new File("text1.txt");

        try {
            Scanner scan = new Scanner(file);
            while(scan.hasNext()) {
                System.out.println(scan.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Nie ma takiego pliku");
        }
    }
}
