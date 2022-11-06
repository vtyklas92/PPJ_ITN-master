package PPJ_ITN_0506112022;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj numer miesiaca: ");

        int month = scan.nextInt();

        switch(month){
            case 1,3,5,7,8,10,12 :
                System.out.println("31 dni");
                break;
            case 4,6,9,11 :
                System.out.println("30 dni");
                break;
            default:
                if(month ==2) System.out.println("28 lub 29 dni");
                else System.out.println("Niepoprawny miesiac");
        }

//        switch(month){
//            case 1,3,5,7,8,10,12 -> System.out.println("31 dni");
//            case 4,6,9,11 -> System.out.println("30 dni");
//            case 2 -> System.out.println("28 lub 29 dni");
//            default -> System.out.println("Niepoprawny miesiac");
//        }

    }
}
