import java.util.Arrays;

public class RemoveIndexFromArray {
    public static void main(String[] args) {
        int[] originalArray = {10, 20, 30, 40, 50};
        int indexToRemove = 2; // Index of the element 30

        if (indexToRemove < 0 || indexToRemove >= originalArray.length) {
            System.out.println("Invalid index to remove");
            return;
        }

        // Create a new array with a length of one less than the original
        int[] newArray = new int[originalArray.length - 1];

        // Copy elements before the index to the new array
        System.arraycopy(originalArray, 0, newArray, 0, indexToRemove);

        // Copy elements after the index to the new array, shifting them left by one position
        System.arraycopy(originalArray, indexToRemove + 1, newArray, indexToRemove, originalArray.length - indexToRemove - 1);

        System.out.println("Original array: " + Arrays.toString(originalArray));
        System.out.println("New array after removal: " + Arrays.toString(newArray)); // Output: New array after removal: [10, 20, 40, 50]
    }
}
