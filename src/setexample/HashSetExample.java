package setexample;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();

        set1.add("Guava");
        set1.add("Mango");
        set1.add("Pineapple");
        set1.add("Apple");
        set1.add(null);
        set1.add("Orange");
        set1.add("Guava");
        set1.add(null);
        set1.add("Banana");

        System.out.println("set1 is : "+set1);

        set1.remove("Orange");
        set1.remove("Banana");

        System.out.println("set1 after 2 delete : "+set1);

        System.out.println("traverse hash set using foreach");
        for(String s1 : set1){
            System.out.println(s1);
        }
    }
}
