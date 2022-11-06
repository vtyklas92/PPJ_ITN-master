package PPJ_Zadania_Doadatkowe;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wysokosc choinki:");

        int wysokosc = scan.nextInt();
        int dlugosc = wysokosc*2-1;
        
        for (int i = 0; i < wysokosc ; i++) {
            for (int j = 0; j < dlugosc; j++) {
                if (j < wysokosc - i - 1 || j > wysokosc + i -1)
                    System.out.print(" ");
                else
                    System.out.print("*");

            }
            System.out.println();
        }


        }

    }

