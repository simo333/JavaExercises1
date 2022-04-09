package pl.coderslab.filesnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main05 {
    public static void readFromFile(String fileName) {
        Path sourcePath = Paths.get(fileName);
        String fileNameWithoutExtension = cutExtension(sourcePath.getFileName().toString());
        Path targetPath = Paths.get(
                sourcePath.toAbsolutePath().getParent().toString(), fileNameWithoutExtension + ".html");
        if (Files.exists(sourcePath)) {
            try {
                Files.writeString(targetPath, "<http>" + System.lineSeparator(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
                Files.writeString(targetPath, "<body>" + System.lineSeparator(), StandardOpenOption.APPEND);
                String[] strings = Files.readAllLines(sourcePath).toArray(new String[0]);
                for (String paragraph : strings) {
                    Files.writeString(targetPath, "<p>" + paragraph + "</p>" + System.lineSeparator(), StandardOpenOption.APPEND);
                }
                Files.writeString(targetPath, "</body>" + System.lineSeparator(), StandardOpenOption.APPEND);
                Files.writeString(targetPath, "</http>", StandardOpenOption.APPEND);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }


    }

    public static String cutExtension(String fileName) {
        String[] fileNameWithoutExtension = fileName.split("\\.");
        return fileNameWithoutExtension[0];
    }

    public static void main(String[] args) {
        readFromFile("text4.txt");

    }
}