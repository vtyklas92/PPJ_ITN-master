public class Zadanie4 {
    public static void main(String[] args) {

        float[][] tab = new float[8][8];

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = (float) (Math.random() * 10);
            }
        }

        //print arr
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(String.format("%.3f\t",tab[i][j]) + " ");
            }
            System.out.println();
        }

        float suma1 = 0;
        float suma2 = 0;
        int licznik = 0;
        for (int i = 0; i < tab.length; i++) {
            for (int j = i; j < tab[i].length - i; j++) {

                    if (licznik == 0){
                        suma1 += tab[i][j];
                        suma2 += tab[tab.length - 1 - i][j];
                        licznik++;
                        j = tab[i].length - i -2;
                    }else{
                        suma2 += tab[i][j];
                        suma1 += tab[tab.length - 1 - i][j];
                        licznik--;
                    }
                }
            }

        System.out.println();

        System.out.println("Suma przekatnej od lewego gornego rogu: " + String.format("%.3f",suma1));
        System.out.println("Suma przekatnej od prawego gornego rogu: " + String.format("%.3f",suma2));

    }
}
