import java.util.Hashtable;

public class HashTables {

    public static void main(String[] args) {

        // Hash Tables  = A data structure that stores unique keys-value pairs. Ex.: <Integer, String>
        //                Each key/value pair is known as an Entry
        //                FAST insertion, look up, deletion of key/value pairs
        //                Not ideal for small data sets, great with large data sets

        // hashing      = takes a key and computes an integer (formula will vary based on key & data type)
        //                In a Hash Table, we use the hash % capacity to calculate an index number

        //                key.hashCode() % capacity = index

        // bucket       = an indexed storage location for one or more Entries
        //                can store multiple Entries in case of a collision (linked similarly a LinkedList)

        // collision    = hash function generates the same index for more than one key
        //                less collisions = more efficiency

        // Runtime complexity: Best case = O(1)
        //                     Worst case = O(n) - if all keys generate the same index


        // integer key, string value
        Hashtable<Integer, String> table = new Hashtable<>(10); // initial capacity = 11, load factor = 0.75 (if 75% are filled, will dynamic expand)

        table.put(100, "Spongebob");
        table.put(123, "Patrick");
        table.put(321, "Sandy");
        table.put(555, "Squidward");
        table.put(777, "Gary");

        table.remove(777); // remove entry with key 777

        // print hash, index, key and value for every entry
        for (Integer key : table.keySet()) {
            System.out.println("hash: " + key.hashCode() +
                    "\tindex: " + key.hashCode() % 10 + // index = hash % capacity
                    "\tkey: " + key +
                    "\tvalue: " + table.get(key));
        }

        // string key, string value
        Hashtable<String, String> table2 = new Hashtable<>(10);

        table2.put("100", "Spongebob");
        table2.put("123", "Patrick");
        table2.put("321", "Sandy");
        table2.put("555", "Squidward");
        table2.put("777", "Gary");

        System.out.print("\n");
        // string hashCode uses a different formula (based on ascii values of each char)
        for (String key : table2.keySet()) {
            System.out.println("hash: " + key.hashCode() +
                    "\tindex: " + key.hashCode() % 10 +
                    "\tkey: " + key +
                    "\tvalue: " + table2.get(key));
        }
    }
}
