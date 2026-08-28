public class SelectionSort {

    public static void main(String[] args) {

        // selection sort = search through an array and keep track of the minimum value during
        //                  each iteration. At the end of each iteration, we swap variables.

        //                 Quadratic time O(n^2)
        //                 small data set = okay
        //                 large data set = BAD

        int array[] = {8, 7, 9, 2, 3, 1, 5, 4, 6};

        selectionSort(array);

        for (int i : array) {
            System.out.print(i); // 123456789
        }
    }

    private static void selectionSort(int[] array) {

        // outer loop moves the boundary of the unsorted section forward
        for (int i = 0; i < array.length - 1; i++) {

            // assume the current position holds the minimum value
            int min = i;

            // inner loop scans the rest of the array to find a smaller value
            for (int j = i + 1; j < array.length; j++) {

                if (array[j] < array[min]) {
                    min = j; // update the index of the smallest value found so far
                }
            }

            // swap the found minimum value into its correct sorted position
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
