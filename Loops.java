import java.util.Scanner;

class Loops {
    public static void main(String[] args) {

        // For Loop
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n");
        
        // While Loop
        int j = 0;
        while (j<=10) {
            System.out.print(j+" ");
            j++;
        }
        
        System.out.println("\n");
        
        // Do While Loop
        int k = 0;
        do {
            System.out.print(k+" ");
            k++;
        } while (k<11);
        
        System.out.println("\n");


        // Solve this - print the sum of first n natural numbers
        System.out.print("Enter the n natural numbers u wnat to sum :");
        Scanner sc = new Scanner(System.in);
        int numbers = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= numbers; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        
        
        // Solve this - print the table of the number enter by user
        System.out.print("Enter the n natural numbers u wnat to print the table : ");
        int table = sc.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(table +" x "+i+" = "+table*i);
        }
    }
}
