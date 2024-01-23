class Patterns {
    public static void main(String[] args) {


        // 1. Print the pattern ---> Solid Rectangle
        // * * * *  rows = 4 
        // * * * *  columns = 5 
        // * * * * 
        // * * * * 

        // for (int i = 1; i <= 4; i++) {
        //     for (int j = 1; j <=5; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // 2. Print the pattern ---> Hollow Rectangle
        // * * * * * 
        // *       *
        // *       *
        // * * * * *
        
        int n = 4;
        // int m = 5;

        // Outer Loop
        // for (int i = 1; i <= n; i++) {
        //     // inner loop
        //     for (int j = 1; j <= m; j++) {
        //         // Cell -> (i,j) ,   || --> OR
        //         if (i==1 || j==1 ||i==n || j==m) {
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
                
        //     }
        //     System.out.println();
        // }
        
        
        //.3. Print the pattern ---> Half Pyramid
        // * 
        // * *
        // * * *
        // * * * *
        
        // Outer Loop
        // for (int i = 1; i <= 4; i++) {
        //     // Inner Loop
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // 4. Print the pattern ---> Inverted Half Pyramid
        // * * * *
        // * * *
        // * * 
        // * 

        // Outer Loop
        // for (int i = 4; i >= 1; i--) {
        //     // Inner Loop
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // 5. Print the pattern ---> Inverted Half Pyramid1 (Rotated by 180 deg)
        //       *
        //     * *
        //   * * *
        // * * * *

        // outer loop
        // for (int i = 1; i <= n; i++) {
        //     // inner loop -> space print
        //     for (int j = 1; j <= n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     // Outer loop for star
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // 6. Print the pattern ---> Half Pyramid with numbers
        // 1 
        // 1 2
        // 1 2 3
        // 1 2 3 4


        // Outer Loop
        // for (int i = 1; i <= n; i++) {
        //     // Inner Loop
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }


        // 7. Print the pattern ---> Inverted Half Pyramid with numbers
        // 1 2 3 4
        // 1 2 3
        // 1 2 
        // 1


        // Outer Loop
        // for (int i = n; i >= 1; i--) {
        //     // Inner Loop
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }


        // 8. Print the pattern ---> Floyd's Triangle
        // 1 
        // 2 3
        // 4 5 6
        // 7 8 9 10
        

        // int number = 1;
        // // Outer Loop
        // for (int i = 1; i <= n; i++) {
        //     // Inner Loop
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(number+" ");
        //         number++;
        //     }
        //     System.out.println();
        // }

        // 9. Print the pattern ---> 0-1 Triangle
        // 1 
        // 0 1
        // 1 0 1
        // 0 1 0 1


        // Outer loop
        // for (int i = 1; i <=n; i++) {
        //     // inner loop
        //     for (int j = 1; j <=i; j++) {
        //         if ((i+j)%2 == 0 ) {
        //             System.out.print("1"+" ");
        //         } else {
        //             System.out.print("0"+ " ");
        //         }
        //     }
        //     System.out.println();
        // }

        // 10. Print the pattern ---> butterfly Pattern
        // *             * 
        // * *         * *
        // * * *     * * *
        // * * * * * * * *
        // * * * * * * * *
        // * * *     * * *
        // * *         * *
        // *             *

        // Upper half
        // for (int i = 1; i <= n; i++) {
        //     //First part
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
            
        //     // spaces
        //     int spaces = 2 * (n-i);
        //     for (int j = 1; j <=spaces; j++) {
        //         System.out.print(" ");
        //     }

        //     // SecondPart
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // // Lower Half
        // for (int i = n; i >= 1; i--) {
        //     //First part
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
            
        //     // spaces
        //     int spaces = 2*(n-i);
        //     for (int j = 1; j <=spaces; j++) {
        //         System.out.print(" ");
        //     }

        //     // SecondPart
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // } 



        // 11. Print the pattern ---> Solid Rhombus
        //         * * * * *
        //       * * * * *
        //     * * * * *
        //   * * * * *
        // * * * * *

        int m =5;
        // for (int i = 1; i <= m; i++) {
        //     // Spaces
        //     int spaces = m-i;
        //     for (int j = 1; j <= spaces ; j++) {
        //         System.out.print(" ");
        //     }

        //     // Stars 
        //     for (int j = 1; j <=5; j++) {
        //         System.out.print("*");
                
        //     }
        //     System.out.println();
        // }


        // 12. Print the pattern ---> Number Pyramid
        //         1 
        //        2 2 
        //       3 3 3 
        //      4 4 4 4 
        //     5 5 5 5 5 
        

        // for (int i = 1; i <= m; i++) {
        //     // Spaces
        //     int spaces = m-i;
        //     for (int j = 1; j <= spaces ; j++) {
        //         System.out.print(" ");
        //     }

        //     //  Numbers -> print row number - row times
        //     for (int j = 1; j <=i; j++) {
        //         System.out.print(i + " ");
        //     }

        //     System.out.println();
            
        // }

        // 13. Print the pattern ---> Palindrome Pattern
        //         1 
        //       2 1 2 
        //     3 2 1 2 3 
        //   4 3 2 1 2 3 4 
        // 5 4 3 2 1 2 3 4 5 
        
        // for (int i = 1; i <= m; i++) {
            
        //     //  Spaces
        //     int spaces = m-i;
        //     for (int j = 1; j <= spaces ; j++) {
        //         System.out.print(" ");
        //     }

        //     // !st half numbers print
        //     for (int j = i; j >=1; j--) {
        //         System.out.print(j);
        //     }
        //     // !st half numbers print
        //     for (int j = 2; j <=i; j++) {
        //         System.out.print(j );  
        //     }
        //     System.out.println();

        // }


        // 14. Print the pattern ---> Diamond Pattern
        //         * 
        //       * * * 
        //     * * * * * 
        //   * * * * * * * 
        //   * * * * * * * 
        //     * * * * *  
        //       * * *   
        //         * 
         

        // Upper Half 
        for (int i = 1; i <= n; i++) {
            //  spaces
            int spaces = m-i;
            for (int j = 1; j <= spaces ; j++) {
                System.out.print(" ");
            }

            //   stars
            int stars = 2 * i-1;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        // Lower Half 
        for (int i = n; i >= 1; i--) {
            //  spaces
            int spaces = m-i;
            for (int j = 1; j <= spaces ; j++) {
                System.out.print(" ");
            }

            //   stars
            int stars = 2 * i-1;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
