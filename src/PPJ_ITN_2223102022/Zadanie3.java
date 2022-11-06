package PPJ_ITN_2223102022;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
    //Algorytm Euklidesa z odejmowaniem
        Scanner scan = new Scanner(System.in);

        System.out.print("Program znajdujący NWD dwóch liczb\n" + "Podaj dwie liczby: ");

        int liczba_1 = scan.nextInt();
        int liczba_2 = scan.nextInt();

        while(liczba_1 != liczba_2){
            if(liczba_1 > liczba_2){
                liczba_1 -= liczba_2;
            }else
                liczba_2 -= liczba_1;
        }
        System.out.println("NWD = " + liczba_1);
    }
}
