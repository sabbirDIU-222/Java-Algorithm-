
package hello;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// java sorting technic
public class AlgorithmDemo {
    // first we see sort method in java 
    // it is use to sort or used to ordered all the value we asssign 
    
    public static void main(String[] args) {
        
        // we can use linked list
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(0);
        
        /// firstly we notice about which is maximum and which is minimum 
        
        int min = Collections.min(list);
        System.out.println("the minimun value printed : " + min + " \n");        
        
        int max  = Collections.max(list);
        System.out.println("the maximum value in list printed : " + max +"\n" );
        
        
        
        System.out.println("before sorting");
        list.forEach((i) -> {
            
            System.out.println(i);
        } );
        
        Collections.sort(list);
        System.out.println("after sorting ");
        System.out.println(list);
        
        // and we can destroy what we have 
        // using shuffle method -> in collection farmwork 
        // The shuffle() method of the Java collections framework is used to destroy any kind of order present in the data structure. 
        //It does just the opposite of the sorting. 
        Collections.shuffle(list);
        System.out.println("opposite of sorting is shuffle() method :");
        System.out.println(list);
      
        
        
        
    }   
}
/*

before sorting
5
4
3
2
1
0
after sorting 
[0, 1, 2, 3, 4, 5]

opposite of sorting is shuffle() method :
[3, 1, 2, 5, 4, 0]
BUILD SUCCESSFUL (total time: 0 seconds)


*/