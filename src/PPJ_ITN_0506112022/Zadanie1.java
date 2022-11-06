package PPJ_ITN_0506112022;

import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj dwie liczby:");
        double val1 = scan.nextDouble();
        double val2 = scan.nextDouble();

        System.out.println("Podaj operacje jaka ma być wykonaana na tych liczbach (+,-,*,/");

        char operation = scan.next().charAt(0);

        switch(operation){
            case '+' :
                System.out.println("Dodawanie: " + (val1+val2));
                break;
            case '-' :
                System.out.println("Odejmowanie: " + (val1 - val2));
                break;
            case '*' :
                System.out.println("Mnożenie: " + (val1*val2));
                break;
            case '/' :
                if(val2 != 0){
                    System.out.println("Dzielnie: " + (val1/val2));
                }else System.out.println("Dzielenie przez 0");
                break;

            default:
                System.out.println("Niepoprawny znak");

        }
    }
}
