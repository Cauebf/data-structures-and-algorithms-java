public class MergeSort {

    public static void main(String[] args) {

        // merge sort = recursively divide array in 2, sort, re-combine
        //              run-time complexity  = O(n log n)
        //              space complexity     = O(n)

        int[] array = {8, 2, 5, 3, 4, 7, 6, 1};

        mergeSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]); // 12345678
        }
    }

    private static void mergeSort(int[] array) {

        int length = array.length;
        if (length <= 1) return; // base case

        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0; // left array
        int j = 0; // right array

        // divide array into 2 halves
        for (; i < length; i++) {

            if (i < middle) {
                leftArray[i] = array[i]; // copy first half into leftArray
            } else {
                rightArray[j] = array[i]; // copy second half into rightArray
                j++;
            }
        }

        // recursively sort each half until they're broken down to single elements
        mergeSort(leftArray);
        mergeSort(rightArray);

        // merge the sorted halves back into the original array
        merge(leftArray, rightArray, array);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {

        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0; // i = array index, l = left array index, r = right array index

        // compare elements from both halves and place the smaller one back into array
        while (l < leftSize && r < rightSize) {

            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }

        // copy any remaining elements from leftArray (if rightArray finished first)
        while (l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }

        // copy any remaining elements from rightArray (if leftArray finished first)
        while (r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}
