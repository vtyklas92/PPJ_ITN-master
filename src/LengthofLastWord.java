

public class LengthofLastWord {
    public int lengthOfLastWord( String s) {
        String[] statmentWords = s.split(" ");
        String lastWord = statmentWords[statmentWords.length-1];
        int result = lastWord.length();
        return result;
    }

    public static void main(String[] args) {
        LengthofLastWord object = new LengthofLastWord();
        String statment = "Java jest super";
        System.out.println(object.lengthOfLastWord(statment));

    }
}
