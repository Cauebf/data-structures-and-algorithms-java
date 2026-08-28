public class InsertionSort {

    public static void main(String[] args) {

        // insertion sort = after comparing elements to the left
        //                  shift elements to the right to make room to insert a value

        //                  Quadratic time O(n^2)
        //                  small data set = decent
        //                  large data set = BAD

        //                  Less steps than Bubble Sort
        //                  Best case is O(n) compared to Selection Sort O(n^2)

        int[] array = {9, 1, 8, 2, 7, 3, 6, 5, 4};

        insertionSort(array);

        for (int i : array) {
            System.out.print(i); // 123456789
        }
    }

    private static void insertionSort(int[] array) {

        // start at index 1, treating index 0 as the already-sorted section
        for (int i = 1; i < array.length; i++) {

            // hold the current value to be inserted
            int temp = array[i];
            int j = i - 1;

            // shift elements to the right while they are greater than temp
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }

            // insert temp into its correct position
            array[j + 1] = temp;
        }
    }
}
