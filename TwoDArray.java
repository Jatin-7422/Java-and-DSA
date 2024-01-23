import java.util.Scanner;

class TwoDArray {
    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int cols = sc.nextInt();

        // 2D Array 
        int matrix[][] = new int[rows][cols];
        

        // Input in Array

        //  Rows
        for (int i = 0; i < rows; i++) { 
            //  Columns
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        //  Find an element on 2D Array 
        int x = sc.nextInt();

        for (int i = 0; i < rows; i++) { 
            //  Columns
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == x){
                    System.out.print("x is found at " + "(" + i + " ," + j + ")" );
                }
            }
        }
        

        
        // // Output in Array
        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < cols; j++) {
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }
    }
}
