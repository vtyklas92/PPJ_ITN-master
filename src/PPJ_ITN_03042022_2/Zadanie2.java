package PPJ_ITN_03042022_2;

public class Zadanie2 {
    public static void main(String[] args) {
        int n = 10;
        boolean[] arr = new boolean[n+1];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = true;
        }

        int k = 2;

        for (int i = 0; i < arr.length && i+k < arr.length; i+=k) {
            arr[k+i] = false;
        }

      //print array
        for (int i = 0; i < arr.length;  i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        k =3;
        for (int i = 1; i < arr.length && i+k < arr.length; i+=k) {
            arr[i+k] = false;
        }
        //print array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


        System.out.println();
        k=6;
        int i = k+1;
        while (arr[i] != true) {
            i++;
        }

        System.out.println(i);



    }
}
