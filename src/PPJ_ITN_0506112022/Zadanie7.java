package PPJ_ITN_0506112022;

public class Zadanie7 {
    public static void main(String[] args) {
        //int ze wzgledu na to ze obliczenia finansowe sa zawsze calkowite a ze nie znamy BigDecimal to tak musi byc.
        int[] bilon = {500,200,100,50,20,10,5,2,1};

        double reszta = 1.75*100;
        int resztawGroszach = (int)reszta;

        for (int i = 0; i < bilon.length; i++) {
            int iloscBilonu = 0;
            int tempReszta = resztawGroszach;

            while(tempReszta > 0) {

                if (tempReszta - bilon[i] >= 0) {
                    resztawGroszach -= bilon[i];
                    tempReszta = resztawGroszach;
                    iloscBilonu++;
                } else {
                    tempReszta -= bilon[i];
                }
            }
                if (i < 3 && iloscBilonu > 0) {
                    System.out.println(iloscBilonu + " * " + bilon[i]/100 + " zl");
                } else if (i >= 3 && i < 6 && iloscBilonu > 0) {
                    System.out.println(iloscBilonu + " * " + bilon[i] + " gr");
                } else if(i >= 6 && iloscBilonu > 0)
                    System.out.println(iloscBilonu + " * " + bilon[i] + " gr");
            }
        }
    }


