package Problems;

public class Subsequences {

    public static void subsequences(String str, int idx, String NewString) {
        if (idx == str.length()) {
            System.out.println(NewString);
            return;
        }

        char CurrentChar = str.charAt(idx);

        // to be in a new string
        subsequences(str, idx + 1, NewString + CurrentChar);
        
        // Not to be in a new string
        subsequences(str, idx + 1, NewString);
    }

    public static void main(String[] args) {
        String str = "abc";
        subsequences(str, 0, "");
    }
}
