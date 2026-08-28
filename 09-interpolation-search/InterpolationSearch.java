public class InterpolationSearch {

    public static void main(String[] args) {

        // interpolation search =   improvement over binary search, best used for "uniformly" distributed data.
        //                          "guesses" where a value might be based on calculated probe results
        //                          if probe is incorrect, search area is narrowed, and a new probe is calculated

        //                          average case: O(log(log(n)))
        //                          worst case:   O(n) [values increase exponentially]

        // sorted array with uniformly distributed value
        int[] array = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
        
        int index = interpolationSearch(array, 256);

        if (index != -1) {
            System.out.println("Value found at index: " + index);
        }
        else {
            System.out.println("Value not found in the array.");
        }
    }

    private static int interpolationSearch(int[] array, int value) {

        // define the initial search boundaries
        int low = 0;
        int high = array.length - 1;

        while (value >= array[low] && value <= array[high] && low <= high) {

            // Estimate the probable position of the value
            // using linear interpolation between low and high
            int probe = low + (high - low) * (value - array[low]) /
                        (array[high] - array[low]);

            System.out.println("probe: " + probe);

            if (array[probe] == value) {
                // value found at the estimated position
                return probe;
            }
            else if (array[probe] < value) {
                // narrow the search to the upper half
                low = probe + 1;
            }
            else {
                // narrow the search to the lower half
                high = probe - 1;
            }
        }

        // value not found
        return -1;
    }
}
