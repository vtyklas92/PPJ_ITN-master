package PPJ_ITN_0506112022;

import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita: ");
        int n = scanner.nextInt();
        int potega = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 4; j++) {
                potega *= i;
                System.out.print(potega + "\t");
            }
            System.out.println();
            potega = 1;
        }
    }
}
