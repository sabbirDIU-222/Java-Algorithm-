
package hello;

// In this Program we manipulate data 

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// using Collection farmework

public class AlgorithmDemo2 {
    public static void main(String[] args) {
     List<Integer> list = new ArrayList<>();
        
        list.add(3);
        list.add(9);
        list.add(19);
        list.add(92);
        list.add(39);
        
        System.out.println(list);
        
       Collections.reverse(list);
        System.out.println("after reverse : ");
        System.out.println(list);
        //after reverse : 
       //[39, 92, 19, 9, 3]
       
       
        
        
        System.out.println("\r\n after swapping ");
        Collections.swap(list, 3, 1);
        System.out.println(list);
        // after swapping 
        //[39, 9, 19, 92, 3] 9 replace with 92

        
        System.out.println("\r\n now look at the metod of fill() : ");
        System.out.println("we fill all the elements with 10 or anything else ");
        Collections.fill(list, 10);   
        System.out.println(list);
        
        
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(list);// we can add all ellemets of list
        
        System.out.println(list2);
        // using copy method we copy all the element from one list to anoter list
        
        Collections.copy(list2, list);
        System.out.println(list2);
        
        /*
        [3, 9, 19, 92, 39]
after reverse : 
[39, 92, 19, 9, 3]
[39, 92, 19, 9, 3]
[39, 92, 19, 9, 3]

 after swapping 
[39, 9, 19, 92, 3]

 now look at the metod of fill() : 
we fill all the elements with 10 or anything else 
[10, 10, 10, 10, 10]
BUILD SUCCESSFUL (total time: 0 seconds)
*/
        
    }
}
