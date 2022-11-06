import java.util.Scanner;
//Zadanie 2a i 2b
public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj rok: ");
        int rok = scan.nextInt();
//2b
        boolean przez4 = rok % 4 == 0;
        boolean niePrzez100 = rok % 100 != 0;
        boolean przez400 = rok % 400 == 0;

        String result = przez4 && niePrzez100 || przez400 ? "Rok przestępny" : "Rok zwyczajny";

        System.out.println(result);
    }

//2a
//        if(rok%4 == 0){
//            if(rok%100 != 0){
//                System.out.println("Rok przestepny");
//            }else if(rok % 400 == 0){
//                System.out.println("Rok przestepny");
//            }else System.out.println("Rok zwyczajny");
//
//        }else System.out.println("Rok zwyczajny");
    }


