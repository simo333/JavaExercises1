package pl.coderslab.datainput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main07 {
    public static void nettoBrutto() {
        Scanner scan = new Scanner(System.in);
        boolean successfulInput = false;
        String menuChoice = "";
        double numberToCalculate = 0;

        while (!successfulInput) {
            System.out.println("Kalkulator brutto-netto / netto-brutto");
            System.out.println("'bn' - zamiana brutto na netto");
            System.out.println("'nb' - zamiana netto na brutto");
            menuChoice = scan.nextLine();
            if (menuChoice.equals("bn") || menuChoice.equals("nb")) {
                successfulInput = true;
            }
        }

        successfulInput = false;

        while (!successfulInput) {
            System.out.print("Wprowadz liczbe, ktora mam przeliczyc: ");
            try {
                numberToCalculate = scan.nextDouble();
                if (numberToCalculate <= 0) {
                    throw new IllegalArgumentException("Wprowadz liczbe wieksza niz 0.");
                }
                successfulInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Wprowadzono nieprawidlowe dane. Musisz podac liczbe.");
                scan.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                scan.nextLine();
            }
        }

        if (menuChoice.equals("nb")) {
            double brutto = numberToCalculate * 1.23;
            System.out.println("Wartosc BRUTTO wynosi " + brutto);
        } else {
            double netto = numberToCalculate / 1.23;
            System.out.println("Wartosc NETTO wynosi " + netto);
        }
    }


    public static void main(String[] args) {
        nettoBrutto();
    }
}
