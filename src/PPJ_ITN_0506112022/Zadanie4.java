package PPJ_ITN_0506112022;

public class Zadanie4 {
    public static void main(String[] args) {
        int n = 8;
        double a = 3;
        double q = 0.7;
        double suma = 0.0;
        double potega = 1.0;

        //bez wzoru
        for (int i = 0; i < n; i++) {
            if(i == 0){
                suma += a;
            } else {
                potega *= q;
                suma += a * potega;
            }
            System.out.println(suma);
        }







    }
}
