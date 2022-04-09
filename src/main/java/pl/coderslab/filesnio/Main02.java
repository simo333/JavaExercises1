package pl.coderslab.filesnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main02 {
    public static void createFile(String fileName) {
        Path path = Paths.get(fileName);
        if(!Files.exists(path)) {
            try {
                Files.createFile(path);
                System.out.println("Utworzono plik o nazwie - " + path);
            } catch (IOException e) {
                System.out.println("Nie mogłem utworzyć pliku -> " + path);
            }
        } else {
            System.out.println("Plik o tej nazwie już istnieje -> " + path);
        }
    }

    public static void main(String[] args) {
        createFile("plik.txt");
    }
}
