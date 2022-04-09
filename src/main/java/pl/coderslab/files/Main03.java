package pl.coderslab.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main03 {


    public static void main(String[] args) {
        calcSumFromFile();

    }

    private static void calcSumFromFile() {
        File file = new File("text3.txt");
        StringBuilder text = new StringBuilder();
        double sum = 0;

        try (Scanner scan = new Scanner(file)) {
            while (scan.hasNextLine()) {
                text.append(scan.nextLine()).append(',');
            }
        } catch (FileNotFoundException e) {
            System.err.println("Nie ma takiego pliku - " + file);
        }
        String[] elements = text.toString().split(",");
        for (String element : elements) {
            try {
                double number = Double.parseDouble(element);
                sum += number;
            } catch (NumberFormatException e) {
                System.err.println("Pominąłem: " + element);
            }
        }

        System.out.println("Suma: " + sum);
    }
}
