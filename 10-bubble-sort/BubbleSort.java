public class BubbleSort {

    public static void main(String[] args) {

        // bubble sort = pairs of adjacent elements are compared, and the elements
        //               are swapped if they are in the wrong order.

        //               Quadratic time: O(n^2)
        //               small data set: okay-ish
        //               large data set: BAD

        int array[] = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        
        bubbleSort(array);
        
        for (int i : array) {
            System.out.print(i); // 123456789
        }
    }

    private static void bubbleSort(int[] array) {

        // outer loop controls how many passes we make through the array
        for (int i = 0; i < array.length - 1; i++) {

            // inner loop compares each pair of adjacent elements
            // "- i" skips the end, since it's already sorted after each pass
            for (int j = 0; j < array.length - 1 - i; j++) {

                // if current element is bigger than the next one, swap them
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
