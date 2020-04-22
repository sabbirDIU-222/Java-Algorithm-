
package hello;

// in this algoritm we can learn binary search 

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearchDemo {
    public static void main(String[] args) {
        
        // The binarySearch() method of the Java collections framework searches for the specified element
        // It returns the position of the element in the specified collections
        
        // * so it will return the index number of our destination
        

        ArrayList<Integer> lsit = new ArrayList<>();
        lsit.add(20);
        lsit.add(10);
        lsit.add(40);
        lsit.add(33);
        lsit.add(55);
        
       Collections.sort(lsit);
        System.out.println("all elemets look like : " +  lsit);
        
        int d = Collections.binarySearch(lsit, 33);
        System.out.print("index number of vlaue 33 is : ");
        System.out.println(d);
        
   
        
    }

}
