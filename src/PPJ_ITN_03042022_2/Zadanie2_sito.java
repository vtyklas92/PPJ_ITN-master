package PPJ_ITN_03042022_2;

public class Zadanie2_sito {
    public static void main(String[] args) {
        int n = 10;
        int k = 2;

        int[] arr = new int [n+1];

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = i;
        }

        //sito
        int warunekKonca = (int) Math.sqrt(n);
        while (k <=warunekKonca){

            for(int i = k; i<arr.length && i+k < arr.length; i+=k){
                if(arr[k] != 0){
                    arr[i+k] = 0;
                }
            }
            k++;
        }

        System.out.println("Liczby pierwsze od 2 do " + n + ":");
        for (int i = 2; i < arr.length; i++) {
            if(arr[i] != 0){
                System.out.print(arr[i] + " ");
            }
        }


    }
}
