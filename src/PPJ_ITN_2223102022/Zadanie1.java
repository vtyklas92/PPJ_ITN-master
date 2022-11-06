import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj współczynniki a,b,c: ");

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        if(!(a == 0)) {

            double delta = b*b - 4*a*c;

            if(delta > 0){

                double x1 = (-b - Math.sqrt(delta))/(2*a);
                double x2 = (-b + Math.sqrt(delta))/(2*a);

                System.out.println("x1 = " + x1 +"\nx2 = " + x2);

            }else
                if(delta == 0){

                    double x = -b/(2*a);

                    System.out.println("x = " + x);
                }else
                    System.out.println("Brak rozwiązań rzeczywistych");
        }else
            if(b != 0){
                double x = -c/b;
                System.out.println("x = " + x);
            }else
                if(c != 0){
                    System.out.println("Równanie liniowe sprzeczne");
                }else{
                    System.out.println("Równanie liniowe tożsamościowe");
                }


    }
}
