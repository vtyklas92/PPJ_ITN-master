package PPJ_ITN_2223102022;

import java.util.Scanner;

public class Zadanie3v2 {
    public static void main(String[] args) {
        //Algorytm Euklidesa z dzieleniem
        Scanner scan = new Scanner(System.in);

        System.out.print("Program znajdujący NWD dwóch liczb\n" + "Podaj dwie liczby: ");

        int liczba_1 = scan.nextInt();
        int liczba_2 = scan.nextInt();

        if(liczba_1 != liczba_2){
            if(liczba_1 > liczba_2){
                int reszta;
                while(liczba_2 != 0){
                    reszta = liczba_1%liczba_2;
                    liczba_1 = liczba_2;
                    liczba_2 =reszta;
                }
                System.out.println("NWD = " + liczba_1);
            }else{
                int reszta;
                while(liczba_1 != 0){
                    reszta = liczba_2%liczba_1;
                    liczba_2 = liczba_1;
                    liczba_1 =reszta;
                }
                System.out.println("NWD = " + liczba_2);
            }
        }else
            System.out.println("NWD = " + liczba_1);
    }
}
