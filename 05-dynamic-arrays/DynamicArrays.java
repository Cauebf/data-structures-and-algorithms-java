public class DynamicArrays {

    public static void main(String[] args) {

        // Java's prebuilt dynamic array
        // ArrayList<String> arrayList = new ArrayList<>();

        // Creating our own dynamic array from scratch
        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");

        System.out.println(dynamicArray); // [A, B, C, D, null, null, null, null, null, null]
        System.out.println(dynamicArray.search("B")); // 1
        dynamicArray.insert(1, "X");
        dynamicArray.delete("A");
        dynamicArray.delete("B");

        System.out.println(dynamicArray); // [X, C, D, null, null]
        System.out.println("size: " + dynamicArray.size); // size: 3
        System.out.println("capacity: " + dynamicArray.capacity); // capacity: 5
        System.out.println("empty: " + dynamicArray.isEmpty()); // empty: false
    }
}
