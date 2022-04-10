package pl.files;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main01 {
    public static void writeToFile() {
        Scanner scan = new Scanner(System.in);
        StringBuilder text = new StringBuilder();

        System.out.println("Wprowadź tekst, który ma być dodany do pliku. 'quit' zakończy wprowadzanie tekstu i zapisze plik.");
        String input = scan.nextLine();
        while (!input.equals("quit")) {
            text.append(input).append('\n');
            input = scan.nextLine();
        }

        try (FileWriter fileWriter = new FileWriter("text1.txt", false)) {
            fileWriter.write(String.valueOf(text));
        } catch (IOException e) {
            System.out.println("Nie znaleziono podanego pliku. Utworzenie nowego o podanej nazwie było niemożliwe.");
        }
    }


    public static void main(String[] args) {
        writeToFile();

    }
}
