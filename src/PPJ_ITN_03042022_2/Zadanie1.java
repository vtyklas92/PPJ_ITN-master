package PPJ_ITN_03042022_2;

    public class Zadanie1 {
        public static void main(String[] args) {

            int size1 = 7;
            int size2 = 6;

            int[] arr1 = new int[size1];
            int[] arr2 = new int[size2];

            System.out.println("Tablica 1: ");

            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = (int)(Math.random() * 100);
                System.out.print(arr1[i] + "\t");
            }

            System.out.println("\n");

            System.out.println("Tablica 2: ");

            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = (int)(Math.random() * 100);
                System.out.print(arr2[i] + "\t");
            }

            System.out.println("\n");

            System.out.println("Polaczone tablice:");

            int[] arr3 = new int[arr1.length + arr2.length];

            int counterArr1 = 0;
            int counterArr2 = 0;

            for (int i = 0; i < arr3.length; i++) {
                if(counterArr1 < arr1.length){
                    arr3[i] = arr1[counterArr1];
                    counterArr1++;
                }else if(counterArr2 < arr2.length){
                    arr3[i] = arr2[counterArr2];
                    counterArr2++;
                }
            }

            for (int e : arr3){
                System.out.print(e + "\t");
            }

            System.out.println("\n");

            int[] wspolneElementy = null;
            int resizeable = 0;
            int[] temp;

            System.out.println("Elementy wspolne:");

            outer:
            for (int value : arr1) {

                for (int i : arr2) {
                    if (value == i) {

                        if (wspolneElementy != null) {
                            for (int j : wspolneElementy) {
                                if (value == j) {
                                    continue outer;
                                }
                            }
                            temp = new int[++resizeable];
                            System.arraycopy(wspolneElementy, 0, temp, 0, wspolneElementy.length);
                        } else {
                            temp = new int[++resizeable];
                        }
                        temp[resizeable - 1] = value;
                        wspolneElementy = temp;
                    }
                }
            }

            if(wspolneElementy != null) {
                for (int i : wspolneElementy) {
                    System.out.print(i + "\t");
                }
            }else System.out.print("Brak wartosci");

            System.out.println("\n");

            int min = arr3[0];
            int max = arr3[0];

            for (int i = 1; i < arr3.length; i++) {
                if(arr3[i] < min){
                    min = arr3[i];
                }else
                if(arr3[i] > max){
                    max = arr3[i];
                }
            }

            System.out.println("Dolny zakres: " + min);
            System.out.println("Gorny zakres: " + max +"\n");


            int[][] tablicaFlag = new int[2][arr3.length];

            System.arraycopy(arr3, 0, tablicaFlag[0], 0, arr3.length);

            for (int[] ints : tablicaFlag) {
                for (int anInt : ints) {
                    System.out.print(anInt + "\t");
                }
                System.out.println();
            }

            int uniqCounter = 0;

            for (int i = 0; i < tablicaFlag[0].length ; i++) {

                for (int j = i; j < tablicaFlag[0].length - 1; j++) {

                    if (tablicaFlag[0][i] == tablicaFlag[0][j + 1] && tablicaFlag[1][j+1] != -1) {
                        tablicaFlag[1][j+1] = -1;
                    }
                }

            }

            //Zliczenie uniklanych wartości

            for (int i = 0; i < tablicaFlag[1].length; i++) {
                if(tablicaFlag[1][i] == 0){
                    uniqCounter++;
                }
            }

            System.out.println();

            for (int[] ints : tablicaFlag) {
                for (int anInt : ints) {
                    System.out.print(anInt + "\t");
                }
                System.out.println();
            }

            System.out.println();

            //Tworzenie tablicy unikatow

            int[] uniqueArr = new int[uniqCounter];

            int counter = 0;

            for (int i = 0; i < tablicaFlag[1].length; i++) {
                if(tablicaFlag[1][i] == 0){
                    uniqueArr[counter] = tablicaFlag[0][i];
                    counter++;
                }
            }

            System.out.println("Tablica unikatow:");

            for(int i : uniqueArr){
                System.out.print(i + "\t");
            }

            System.out.println("\n");

            System.out.println("Tablica wartosci pomiedzy "+ min + " a " + max + " z wylaczeniem wartosci a poprzednich tablic to:");


            if(max - min + 1 - uniqCounter > 0){ //Sprawdzenie czy tablica nie jest pusta

                    int[] tablicaZakresu = new int[max - min + 1 - uniqCounter];
                    int counter1 = -1;

                outer1:
                for (int i = min+1; i < max-1; i++) {
                    for (int k : uniqueArr) {
                        if (i == k) {
                            continue outer1;
                        }
                    }
                    tablicaZakresu[++counter1] = i;

                }
                int zakres = 0;
                for (int i : tablicaZakresu) {
                    zakres++;
                    if (zakres % 10 == 0) {
                        System.out.print(i + "\n");
                    } else System.out.print(i + "\t");
                }
            }else System.out.println("Pusty zakres");



        }
    }

