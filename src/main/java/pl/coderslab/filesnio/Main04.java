package pl.coderslab.filesnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Main04 {
    public static void writeToFile(String fileName) {
        Scanner scanner = new Scanner(System.in);
        Path path = Paths.get(fileName);
        System.out.println("Podaj dane jakie chcesz zapisac. 'quit' zakonczy pobieranie danych i zapisze plik.");
        String input = scanner.nextLine();
        while (!input.equals("quit")) {
            try {
                Files.writeString(
                        path, input + System.lineSeparator(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
                input = scanner.nextLine();
            } catch (IOException e) {
                System.out.println("Nie udało się zapisać pliku." + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        writeToFile("Task4.txt");

    }
}
