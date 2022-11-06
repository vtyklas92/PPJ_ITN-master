import java.util.Scanner;

public class Zadanie2cp {
    public static void main(String[] args) {
        //Pobierz od użytkownika liczbę całkowitą dodatnią
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita dodatnia:");
        int liczba = scan.nextInt();
        //Oblicz sumę cyfr tej liczby
        int suma = 0;
        while(liczba > 0){
            suma += liczba%10;
            liczba /=10;
        }
        System.out.println("Suma cyfr podanej liczby to: " + suma);
        //Oblicz stosunek średniej arytmetycznej cyfr parzystych do średniej arytmetycznej cyfr nieparzystych
        int parzyste = 0;
        int nieParzyste = 0;
        int ctr1 = 0;
        int ctr2 = 0;
        while(liczba > 0){
            if(liczba%2==0){
                parzyste += liczba%10;
                ctr1++;
            }else {
                nieParzyste += liczba%10;
                ctr2++;
            }
            liczba /=10;
        }
        double sredniaParzystych = (double)parzyste/ctr1;
        double sredniaNieParzystych = (double) nieParzyste/ctr2;
        System.out.println("Stosunek sredniej parzystych do nieparzystych wynosi: " + sredniaParzystych + " do " + sredniaNieParzystych);
    }
}
