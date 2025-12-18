// Hashing is a technique to convert K, V -> Indices
// Load factor is a measure of how full the hash table is allowed to get before its capacity is automatically increased.

import java.util.HashSet;

public class MyHashSet {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);

        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(3);
        myHashSet.add(11);
        myHashSet.add(11);
        
        System.out.println(myHashSet);
    }
}