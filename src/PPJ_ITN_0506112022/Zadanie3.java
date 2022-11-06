package PPJ_ITN_0506112022;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj a: ");
        double a = scan.nextDouble();

        System.out.println("Podaj przyblizenie: ");
        double approximation = scan.nextDouble();

        double result;
        double x = 1.0;

        do {
            result = 0.5*(x - a/x);
            x -= result;

        } while (Math.abs((result)) >= approximation);

        System.out.println(x);
    }
}
