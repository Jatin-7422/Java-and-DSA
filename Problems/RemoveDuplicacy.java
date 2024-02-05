package Problems;

public class RemoveDuplicacy {

    public static boolean[] Map = new boolean[26]; // Boolean Array of containing Alphabets which returns true or false

    public static void RemoveDuplicates(String str, int idx, String NewString) {
        if (idx == str.length()) {
            System.out.println(NewString);
            return;
        }
        char CurrentChar = str.charAt(idx);
        if (Map[CurrentChar - 'a'] == true) {
            RemoveDuplicates(str, idx + 1, NewString);
        } else {
            NewString += CurrentChar;
            Map[CurrentChar - 'a'] = true;
            RemoveDuplicates(str, idx + 1, NewString);
        }
    }

    public static void main(String[] args) {
        String str = "abbccda";
        RemoveDuplicates(str, 0, "");
    }

}
