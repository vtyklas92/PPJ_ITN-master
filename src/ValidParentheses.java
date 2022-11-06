import java.util.HashMap;
import java.util.Map;

public class ValidParentheses {

    public static boolean output(String s){
        if(s.length()%2!=0){
            return false;
        }

        char[] chars = s.toCharArray();

        Map<Integer,Character> charsMap = new HashMap<>();


        for (int i = 0; i < chars.length; i++) {


        }


        return true;
    }

    public static void main(String[] args) {
        output("{}");
        System.out.println((int)'[');
        System.out.println((int)']');
        System.out.println((int)'{');
        System.out.println((int)'}');
        System.out.println((int)'(');
        System.out.println((int)')');
    }
}
