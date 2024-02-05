
package Problems;

public class Occurence_of_Element {

    public static int first = -1;
    public static int last = -1;

    public static void FindOccurence(String str, int idx, char element) {

        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }

        char Current_character = str.charAt(idx);
        if (Current_character == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;

            }
        }

        FindOccurence(str, idx + 1, element);

    }

    // Main Function to access the function
    public static void main(String[] args) {
        String str1 = "abaacdaefaah";
        FindOccurence(str1, 0, 'a');
    }

}
