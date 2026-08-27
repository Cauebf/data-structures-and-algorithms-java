import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

        // binary search = Search algorithm that finds the position
        //                 of a target value within a sorted array.
        //                 Half of the array is eliminated during each "step"

        int array[] = new int[1000000];
        int target = 777777;

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        // built-in binary search implementation
        // int index = Arrays.binarySearch(array, target);

        // our binary search implementation
        int index = binarySearch(array, target);

        if (index == -1) {
            System.out.println(target + " not found");
        } else {
            System.out.println(target + " found at index " + index);
        }
    }

    private static int binarySearch(int[] array, int target) {

        int low = 0; // first array index
        int high = array.length - 1; // last array index

        while (low <= high) {

            int middle = low + (high - low) / 2; // middle index
            int value = array[middle]; // middle value

            System.out.println("middle: " + value);

            if (value < target) low = middle + 1; // if value is less than target, search right
            else if (value > target) high = middle - 1; // if value is greater than target, search left
            else return middle; // target found
        }

        return -1; // target not found
    }
}
