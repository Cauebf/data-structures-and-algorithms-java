public class DynamicArray {

    int size;
    int capacity = 10;
    Object[] array;

    public DynamicArray() {
        this.array = new Object[capacity];
    }

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    public void add(Object data) {

        // If the array is full, grow it
        if(size >= capacity) {
            grow();
        }

        // Add the new element to the end of the array
        array[size] = data;
        size++;
    }

    public void insert(int index, Object data) {

        // If the array is full, grow it
        if (size >= capacity) {
            grow();
        }

        // Shift elements to the right to make space for the new element
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }

        // Add the new element to the specified index
        array[index] = data;
        size++;
    }

    public void delete(Object data) {

        for (int i = 0; i < size; i++) {

            if (array[i].equals(data)) {

                // Shift elements to the left to fill the gap
                for (int j = 0; j < (size - i - 1); j++) {
                    array[i + j] = array[i + j + 1];
                }

                // Remove the last element
                array[size - 1] = null;
                size--;

                // If the array is less than or equal to 1/3 full, shrink it
                if (size <= (int)(capacity / 3)) {
                    shrink();
                }

                break;
            }
        }
    }

    public int search(Object data) {

        for (int i = 0; i < size; i++) {

            // If the current element matches the target data, return its index
            if (array[i].equals(data)) {
                return i;
            }
        }

        // If the data is not found, return -1
        return -1;
    }

    private void grow() {

        // Double the capacity
        int newCapacity = (int)(capacity * 2);
        Object[] newArray = new Object[newCapacity];

        // Copy elements from the old array to the new array
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }

        array = newArray;
        capacity = newCapacity;
    }

    private void shrink() {

        // Halve the capacity
        int newCapacity = (int)(capacity / 2);
        Object[] newArray = new Object[newCapacity];

        // Copy elements from the old array to the new array
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }

        array = newArray;
        capacity = newCapacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {

        String string = "";

        for (int i = 0; i < capacity; i++) {
            string += array[i] + ", ";
        }

        if (string != "") {
            string = "[" + string.substring(0, string.length() - 2) + "]";
        } else {
            string = "[]";
        }

        return string;
    }
}
