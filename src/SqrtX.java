import java.util.ArrayList;

public class SqrtX {

    final double epsilon = 0.001;
    public int mySqrt(double pole){

        double a = 1;
        double b = pole;
        while(Math.abs(a-b)>epsilon){
            a = (a+b)/2;
            b = pole/a;

        }

        int result = (int) ((a+b)/2);

        return result;

    }

    public static void main(String[] args) {

        SqrtX test = new SqrtX();
        test.mySqrt(10);
    }
}
