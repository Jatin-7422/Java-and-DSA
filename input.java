import java.util.*;

class input {
    public static void main(String[] args) {
        // input
        Scanner input  = new Scanner(System.in);
        // String name = sc.next();  // next() is a function to take input from the terminal and it takes only first name 
        // System.out.println(name);

        String fullname = input.nextLine();  // nextLine() is a function to take input from the terminal and it takes full name 
        System.out.println(fullname);

        //  Nextint() - to take integer input
        int a = input.nextInt();
        System.out.println("this is the variable a : " + a);
        
        //  NextFloat() - to take float input
        float b = input.nextFloat();
        System.out.println("this is the variable b : " + b);

        //  solve this :-  take two input from user and print their sum 
        System.out.println("Enter the first value : ");
        int num1 = input.nextInt();
        
        System.out.println("Enter the Second value : ");
        int num2 = input.nextInt();

        int sum = num1 + num2 ;
        System.out.println("The adititon of two numbers is : " + sum);

    }
}
