package Problems;

public class Permutations {

    public static void PrintPremu(String str, String Permutations , int idx) {

        if (str.length() == 0) {
            System.out.println(Permutations);
            return;
        }


        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            // "abc" --> "bc" remove "a" if we choose "a" 
            String NewString = str.substring(0, i) + str.substring(i+1);
            PrintPremu(NewString, Permutations + currChar , idx +1);

        }

    }


    public static void main(String[] args) {
        String str = "ABC";
        PrintPremu(str, "" , 0);

    }
}
