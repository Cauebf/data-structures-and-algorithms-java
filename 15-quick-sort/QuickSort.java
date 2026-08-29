public class QuickSort {

    public static void main(String[] args) {

        // quick sort           = moves smaller elements to left of a pivot.
        //                        recursively divide array in 2 partitions

        // run-time complexity  = Best case O(n log(n))
        //                        Average case O(n log(n))
        //                        Worst case O(n^2) if already sorted

        // space complexity     = O(log (n)) due to recursion

        int[] array = {8, 2, 5, 3, 9, 4, 7, 6, 1};

        quickSort(array, 0, array.length - 1);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]); // 123456789
        }
    }

    private static void quickSort(int[] array, int start, int end) {

        if (end <= start) return; // base case

        // partition the array and get the pivot's final sorted position
        int pivot = partition(array, start, end);

        // recursively sort the left and right partitions around the pivot
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);
    }

    private static int partition(int[] array, int start, int end) {

        // choose the last element as the pivot
        int pivot = array[end];
        int i = start - 1; // tracks the boundary of elements smaller than the pivot

        // move elements smaller than pivot to the left side
        for (int j = start; j < end; j++) {

            if (array[j] < pivot) {
                i++;
                // swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // place the pivot in its correct sorted position
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i; // return the pivot's final index
    }
}
