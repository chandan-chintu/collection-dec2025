package listexample;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        // declaring ArrayList
        List<Integer> list1 = new LinkedList<>();

        //add elements into list
        list1.add(34);
        list1.add(65);
        //list1.add(null);
        list1.add(12);
        list1.add(34);
        list1.add(89);
        list1.add(55);
        list1.add(9);

        System.out.println("list1 is : "+list1);

        // remove data
        list1.remove(3);
        System.out.println("list1 after removing 3rd index is : "+list1);
        list1.remove(1);
        System.out.println("list1 after removing 1st index is : "+list1);

        // search
        System.out.println("2nd index element is : "+list1.get(2));
        System.out.println("4th index element is : "+list1.get(4));

        // size
        System.out.println("list1 length is : "+list1.size());

        // sort
        Collections.sort(list1); // sort in ascending order
        System.out.println("list1 after sorting in ascending order : "+list1);

        Collections.sort(list1, Collections.reverseOrder()); // sort in descending order
        System.out.println("list1 after sorting in descending order : "+list1);

        // traverse using foreach
        System.out.println("traverse using foreach");
        for(Integer l1 : list1){
            System.out.println(l1);
        }
    }
}
