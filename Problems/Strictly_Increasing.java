package Problems;

public class Strictly_Increasing {

    public static boolean ArrayOrderedStrictly(int arr[], int idx) {

        if (idx == arr.length - 1) {
            return true;
        }

        if (arr[idx] < arr[idx + 1]) {
            // Array is sorted
            return ArrayOrderedStrictly(arr, idx + 1);
        } else {
            // Array is not Sorted
            return false;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 2 };
        System.out.println(ArrayOrderedStrictly(arr, 0));
    }
}
