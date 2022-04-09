package pl.coderslab.filesnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main03 {
    public static void copyFile(String directory, String fileName, String secondFileName) {
        Path sourcePath = Paths.get(directory, fileName);
        Path targetPath = Paths.get(directory, secondFileName);

        try {
            Files.copy(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            System.out.println("Nie znaleziono pliku: " + e.getMessage());
        }

    }

    public static void main(String[] args) {
        copyFile("", "text4.txt", "copied.txt");
    }
}
