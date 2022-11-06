

public class LongestCommonPrefix {
    private int letterCounter = 0;
    private String[] strs;

    public LongestCommonPrefix(String[] strs) {
        this.strs = strs;
    }

    public String output(String[] strs){
        int counter = 0;
        String commonPrefix = "";

        int minLength = strs[0].length();
        int minIndex = 0;
        for (int i = 1; i < strs.length; i++) {
            if(minLength>strs[i].length()){
                minLength = strs[i].length();
                minIndex = i;
            }
        }

        char[] arr = strs[minIndex].toCharArray();
        int counter1 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < strs.length; j++) {
                if (arr[i] == strs[j].charAt(i)) {
                    counter1++;
                } else break;
            }
            if(counter1 == strs.length){
                commonPrefix+=arr[i];
            }else return commonPrefix;
            counter1 = 0;

            }
        return commonPrefix;


    }

    public static void main(String[] args) {

        String[] strs = {};
        LongestCommonPrefix output = new LongestCommonPrefix(strs);

        System.out.println(output.output(strs));
    }
}
