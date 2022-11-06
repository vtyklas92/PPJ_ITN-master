package PPJ_ITN_2223102022;

import java.util.Scanner;

public class Zadanie0 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj dwie liczby: ");
        float liczba1 = scan.nextFloat();
        float liczba2 = scan.nextFloat();


            System.out.println("Suma = " + (liczba1 + liczba2) + "\n" +
                    "Roznica = " + (liczba1 - liczba2) + "\n" +
                    "Iloczyn = " + (liczba1 * liczba2)
            );
        if (!(liczba2 ==0.0))
            System.out.println("Iloraz" + (liczba1/liczba2));
        else
            System.out.println("Dzielenie przez 0");
    }

}




