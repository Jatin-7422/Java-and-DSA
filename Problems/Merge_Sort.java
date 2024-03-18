package Problems;

public class Merge_Sort {

    public static void Conquer(int arr[], int si, int mid, int ei) {

        int merger[] = new int[ei - si + 1];

        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0; // index for the merged array

        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merger[x] = arr[idx1];
                x++;
                idx1++;
            } else {
                merger[x] = arr[idx2];
                x++;
                idx2++;
            }
        }

        // When one array is complete and another one is remaining , so copy the the
        // remaining elements from the array

        while (idx1 <= mid) {
            merger[x] = arr[idx1];
            x++;
            idx1++;
        }

        while (idx2 <= ei) {
            merger[x] = arr[idx2];
            x++;
            idx2++;
        }

        for (int i = 0, j = si; i < merger.length; i++, j++) {
            arr[j] = merger[i];
        }

    }

    public static void Divide(int arr[], int si, int ei) {

        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2; // (si+ei)/2 ---> It makes the space complexity

        // For First Part of the array
        Divide(arr, si, mid);

        // For the second Part of the Array
        Divide(arr, mid + 1, ei);

        Conquer(arr, si, mid, ei);
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        int n = arr.length;

        Divide(arr, 0, n - 1);

        // Printing the elements of the array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}

// Time Complexity --> O(nlogn) --> Worst Case
