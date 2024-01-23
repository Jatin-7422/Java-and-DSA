import java.util.Scanner;

class Strings {
    public static void main(String[] args) {
        // String Declaration
        String name1 = "Jatin ";
        // String fullname = "Jatin Kumar";
        String name2 = "My name is Jatin Kumar";

        // Input by User
        Scanner sc = new Scanner(System.in);
        // String InputName = sc.next();
        String InputName = sc.nextLine();
        System.out.println("Your name is : " + InputName);
        System.out.println(InputName.length());

        // charAt
        // To print the individual character in the string
        for (int i = 0; i < InputName.length(); i++) {
            System.out.println(InputName.charAt(i));
        }

        // comparison between strings
        // compareTo : It checks the characters among the two strings on the basis of their position the greaetr one wins and the initial one loose 
        // IT Cheks 3 Cases:
        // 1 S1 > S2 : Returns a +ve value
        // 2 S1 < S2 : Returns a -ve value
        // 3 S1 == S2 : Returns 0

        if (name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal !!!");
        } else {
            System.out.println("Strings are not equal !!!");
        }

        //  Slicing the String
        // .substring(starting index , ending index)
        System.out.println(name2.substring(11));
    }
}
