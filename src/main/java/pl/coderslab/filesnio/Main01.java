package pl.coderslab.filesnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main01 {
    public static void createDirectory(String directoryName) {
        Path path = Paths.get(directoryName);
        if (!Files.exists(path)) {
            try {
                Files.createDirectory(path);
                System.out.println("Utworzyłem plik");
            } catch (IOException e) {
                System.out.println("Nie mogę utworzyć pliku." + e.getMessage());
            }
        } else {
            System.out.println("Plik już istnieje");
        }
    }

    public static void main(String[] args) {
        createDirectory("katalog");
    }
}
