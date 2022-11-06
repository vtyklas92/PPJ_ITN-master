package PPJ_Zadania_Doadatkowe;

/*Napisać program, który pobiera od użytkownika liczbę całkowitą, a następnie:
        • oblicza sumę cyfr tej liczby,
        • stosunek średniej arytmetycznej cyfr parzystych do średniej arytmetycznej
        cyfr nieparzystych.*/


import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita:");
        int liczba = scan.nextInt();

        int max_wartosc = 10000000;

        System.out.println(liczba % max_wartosc);

        for (int i = 0; i < 6; i++) {
            if(!(liczba / max_wartosc >= 1)){
                max_wartosc/=10;
            }else break;
        }

        int suma = 0;
        int parzyste = 0;
        int nieParzyste = 0;
        int ctr1 = 0;
        int ctr2 = 0;
        while(liczba > 0){
            suma += liczba/max_wartosc;
            if(liczba/max_wartosc%2==0){
                parzyste += liczba/max_wartosc;
                ctr1++;
            }else {
                nieParzyste += liczba/max_wartosc;
                ctr2++;
            }
            liczba %=max_wartosc;
            max_wartosc /=10;
        }

        double sredniaParzystych = (double)parzyste/ctr1;
        double sredniaNieParzystych = (double) nieParzyste/ctr2;





        System.out.println("Suma cyfr podanej liczby to: " + suma);
        System.out.println("Stosunek sredniej parzystych do nieparzystych wynosi: " + sredniaParzystych + " do " + sredniaNieParzystych);
    }
}
