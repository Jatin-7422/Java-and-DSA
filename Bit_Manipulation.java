import java.util.Scanner;

class Bit_Manipulation {
    public static void main(String[] args) {
        int n = 5;
        // int pos = 1;

        //  Get Bit 

        // // 1. Create a BitMask
        // int bitmask = 1<<pos; 
        
        // // 2. Perfrom AND operation
        // if ((bitmask & n) == 0) {
        //     System.out.println("Bit was 0");
        // }else{
        //     System.out.println("Bit was 1");
        // }


        //  Set Bit 

        // 1. Create a BitMask
        // int bitmask = 1<<pos; 
        
        // 2. Create a new number 
        // int newnumber = bitmask | n;
        // System.out.println(n);
        // System.out.println(newnumber); 


        //  Clear Bit 

        // int pos = 2;
        // // 1. Create a BitMask
        // int bitmask = 1<<pos; 
        // int notbitmask = ~bitmask;
        
        // // 2. Create a new number 
        // int newnumber = notbitmask & n;
        // System.out.println(n);
        // System.out.println(newnumber); 


        //  Update Bit 

        int pos = 1;
        // 1. Create a BitMask
        int bitmask = 1<<pos; 

        try (Scanner sc = new Scanner(System.in)){
        int num = sc.nextInt();

        if (num == 1) {
            int newnumber = bitmask|n;
            System.out.println(newnumber);
        }else{
            int notbitmask = ~bitmask;
            int newnumber = notbitmask & n;
            System.out.println(newnumber);

        }
    }
        
        

    }
}
