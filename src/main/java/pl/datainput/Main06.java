package pl.datainput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main06 {
    public static void equation() {
        double[] params = setParameters();
        double delta = Math.pow(params[1], 2) - 4 * params[0] * params[2];

        if (delta > 0) {
            double resultX1 = ((-params[1]) - Math.sqrt(delta)) / 2 * params[0];
            double resultX2 = ((-params[1]) + Math.sqrt(delta)) / 2 * params[0];
            System.out.println("Delta jest większa niż 0. Równanie ma dwa rozwiązania " + resultX1 + " oraz " + resultX2);
        } else if (delta == 0) {
            double result = (-params[1]) / 2 * params[0];
            System.out.println("Delta jest równa 0. Równanie ma jedno rozwiązanie, które wynosi " + result);
        } else {
            throw new ArithmeticException("Delta jest ujemna. To równanie kwadratowe nie ma rozwiązania.");
        }
    }

    public static double[] setParameters() {
        Scanner scan = new Scanner(System.in);
        double a = 0, b = 0, c = 0;
        boolean successfulInput = false;

        while (!successfulInput) {
            try {
                System.out.println("Podaj trzy zmienne do równania kwadratowego:");
                System.out.print("a = ");
                a = scan.nextDouble();
                if (a == 0) {
                    throw new IllegalArgumentException("Parametr a nie może być równy 0.");
                }
                System.out.print("b = ");
                b = scan.nextDouble();
                System.out.print("c = ");
                c = scan.nextDouble();
                successfulInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Wszystkie parametry muszą mieć wartość liczbową.");
                scan.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return new double[]{a, b, c};
    }

    public static void main(String[] args) {
        equation();

    }
}
