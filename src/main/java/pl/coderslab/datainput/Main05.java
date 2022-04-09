package pl.coderslab.datainput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main05 {
    public static void textLines() {
        Scanner scan = new Scanner(System.in);
        List<String> strings = new ArrayList<>();
        System.out.println("Podaj napis: (wpisz 'quit', aby zakończyć wpisywanie)");
        String newString = scan.nextLine();
        while (!newString.equals("quit")) {
            strings.add(newString);
            newString = scan.nextLine();
        }
        System.out.println(strings);
    }

    public static void main(String[] args) {
        textLines();

    }
}
