package Problems;

public class Reverse_of_String {

    public static void PrintReverseString(String str, int index) {

        if (index == 0) {
            System.out.print(str.charAt(index));
            return;
        }

        System.out.print(str.charAt(index));
        PrintReverseString(str, index - 1);
    }
    
    public static void main(String[] args) {
        String str = "abcd";
        PrintReverseString(str, str.length() - 1);
    }
}
