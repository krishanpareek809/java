import java.util.*;

class MyArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(15); 
        ad1.add(18);
        ad1.add(1);
        ad1.addFirst(3);

        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
        System.out.println(ad1.contains(1));
        System.out.println(ad1);
    }
}