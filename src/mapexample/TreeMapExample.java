package mapexample;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new TreeMap<>();
//add some lines
        map1.put(107,"Guava");
        map1.put(103,"Apple");
        map1.put(102,"Mango");
        map1.put(110,"Pineapple");
        map1.put(101,"Banana");
        map1.put(104,"Orange");
        map1.put(102,"Watermelon");// old value gets removed and new value gets added

        System.out.println("map1 is : "+map1);

        map1.remove(104);
        System.out.println("map1 after 104 key remove : "+map1);
        System.out.println("traverse using foreach - entryset");
        for(Map.Entry m1 : map1.entrySet()){
            System.out.println(m1.getKey()+" ----- "+m1.getValue());
        }
//add some lines
    }
}
