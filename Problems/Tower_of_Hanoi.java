package Problems;

public class Tower_of_Hanoi {

    public static void TowerofHanoi(int n, String src, String helper, String dest) { // ( number of disk , src,
                                                                                     // helper,destination)
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }

        TowerofHanoi(n - 1, src, dest, helper); // Transfer 1 disk from src to destination
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
        TowerofHanoi(n - 1, helper, src, dest); // Transfer remaining disk from helper to destination using source as a
                                                // helper

    }

    public static void main(String[] args) {
        int n = 3;
        TowerofHanoi(n, "S", "H", "D");
    }
}
