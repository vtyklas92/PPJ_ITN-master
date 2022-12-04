package PPJ_ITN_03042022_2;

public class Zadanie5 {
    public static void main(String[] args) {
        int[][] tab = {
                {1, 0, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 1}
        };

        int resultLength = tab[0].length + tab[1].length + tab[2].length;
        int[] result = new int[resultLength];

        System.out.println(resultLength);

        int index = 0;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                result[index] = tab[i][j];
                index++;
            }
        }
        //print result
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
