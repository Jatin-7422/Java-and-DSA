import java.util.ArrayList;
import java.util.Collections;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        // Add Element in a list
        list.add(0);
        list.add(4);
        list.add(5);
        System.out.println(list);

        // Get list element
        System.out.println(list.get(1));

        // Add element in between
        list.add(1, 8);
        System.out.println(list);

        // Set element
        list.set(0, 7);
        System.out.println(list);

        // Delete element
        list.remove(3); 
        System.out.println(list);

        // Size of the array list
        int size = list.size();

        System.out.println(size);

        // Loops

        for (int i = 0; i < size; i++) {
            System.out.print(list.get(i));
        }
        System.out.println();

        // Sorting
        Collections.sort(list); // Collection is a class in java which has a sort function
        System.out.println(list);

    }
}
