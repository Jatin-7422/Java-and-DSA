import java.util.*;

class Conditions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age :");
        int age  = sc.nextInt();
        
        //  if else condition
        if (age < 18) {
            System.out.println("You are not eligible to drive a car");
            
        } else {
            System.out.println("You are eligible to drive a car");
            
        }
        
        System.out.print("Enter the value of a:");
        int num1 = sc.nextInt();
        System.out.print("Enter the value of b:");
        int num2 = sc.nextInt();

        // else if condition 
        if (num1 == num2 ) {
            System.out.println("Both numbers are equal ");
        } 
        else if(num1 > num2) {
            System.out.println("a is greater than b "); 
        }
        else {
            System.out.println("b is greater than a "); 
        }


        //  Switch statement 
        int button = sc.nextInt();
        switch (button) {
            case 1:System.out.println("Hello Sir");
                break;
            case 2:System.out.println("Namastey Sir");
                break;
            case 3:System.out.println("Bonjour Sir");
                break;
            default:System.out.println("Invalid Button");
        } 
    }
}
