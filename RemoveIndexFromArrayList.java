import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveIndexFromArrayList {
    public static void main(String[] args) {
        // Convert an array to an ArrayList
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));
        System.out.println("Original list: " + list); // Output: Original list: [A, B, C, D, E]

        int indexToRemove = 2; // Index of the element 'C'

        // Remove the element at the specified index
        String removedElement = list.remove(indexToRemove);

        System.out.println("Removed element: " + removedElement); // Output: Removed element: C
        System.out.println("List after removal: " + list); // Output: List after removal: [A, B, D, E]

        // If needed, convert the ArrayList back to an array
        String[] newArray = list.toArray(new String[0]);
        System.out.println("New array: " + Arrays.toString(newArray)); // Output: New array: [A, B, D, E]
    }}