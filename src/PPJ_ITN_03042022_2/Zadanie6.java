package PPJ_ITN_03042022_2;

public class Zadanie6 {
    public static void main(String[] args) {
        int[][] tab = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15 , 16}
        };

        int poziom = 0;

        while(poziom <= tab.length/2){

            for (int i = poziom; i < tab.length - poziom - 1 ; i++) {
                System.out.print(tab[poziom][i] + "\t");
            }

            for (int i = poziom; i < tab.length - poziom - 1; i++) {
                System.out.print(tab[i][tab.length - poziom - 1] + "\t");
            }

            for (int i = tab.length - poziom - 1; i > poziom; i--) {
                System.out.print(tab[tab.length - poziom - 1][i] + "\t");
            }

            for (int i = tab.length - poziom -1; i > poziom ; i--) {
                System.out.print(tab[i][poziom] + "\t");
            }
            poziom++;

            }
        }

    }

