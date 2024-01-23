public class Recursion2 {

    // Tower of Hanoi
    public static void TowerofHanoi(int n , String src, String helper ,String dest ) { //( number of disk , src, helper,destination)
        if (n==1) {
            System.out.println("Transfer disk "+ n + " from "+ src +" to "+dest);
            return;
        }


        TowerofHanoi(n-1, src, dest, helper); // Transfer 1 disk from src to destination 
        System.out.println("Transfer disk "+ n + " from "+ src +" to "+dest);
        TowerofHanoi(n-1, helper, src, dest); // Transfer remaining disk from helper to destination using source as a hep
        
    }


    // Print a string in reverse

    public static void PrintReverseString(String str , int index) {

        if (index ==0) {
            System.out.print(str.charAt(index));
            return;
        }

        System.out.print(str.charAt(index));
        PrintReverseString(str, index - 1);
    }

    public static void main(String[] args) {
        int n=1;
        TowerofHanoi(n, "S", "H", "D");


        String str = "abcd";
        PrintReverseString(str, str.length()-1);
    }
    
}
