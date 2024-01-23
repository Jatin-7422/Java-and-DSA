import java.util.*;

class Functions {

    // Function to take input from user and print their name
    public static void Print_Name(String name) {
        System.out.println(name);
        return;
    }

    // function to add two numbers
    public static void CalculateSum(int num1, int num2) {
        System.out.println("The sum of two numbers is : " + (num1 + num2));
        return;
    }

    // function to multiply two numbers
    public static void CalculateMultiply(int num1, int num2) {
        System.out.println("The multiplication of two numbers is : " + (num1 * num2));
        return;
    }

    // function to Find the factorial of the number
    public static void Factorial(int num1) {
        int var = 1;
        for (int i = 1; i <= 5; i++) {
            var *= i;
        }
        System.out.println("The Factorial of the " + num1 + " is " + var);
    }

    public static void main(String[] args) {
        System.out.print("Enter your name : ");
        Scanner sc = new Scanner(System.in);
        String user_name = sc.nextLine();

        Print_Name(user_name); // Call of function to print name

        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();

        CalculateSum(a, b); // Call to add Two numbers

        CalculateMultiply(a, b); // Call to multiply Two numbers

        int c = sc.nextInt();
        Factorial(c); // Call to multiply Two numbers

    }
}
