package PPJ_ITN_03042022_2;

public class Zadanie3 {
    public static void main(String[] args) {
        int[] arr1 = new int[(int) (Math.random() * 10) + 1];
        int[] arr2 = new int[(int) (Math.random() * 10) + 1];
        int[] arr3 = new int[(int) (Math.random() * 10) + 1];

        int[][] arr = new int[3][];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = (int) (Math.random() * 10);
        }

        //put arrays in array
        arr[0] = arr1;
        arr[1] = arr2;
        arr[2] = arr3;


        //print arr
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
