/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author User
 */
public class CompositionDemo {
    
    public static void main(String[] args) {
        // firstly we take an arraylist
        // to add some value
        
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(2);
        list.add(21);
        list.add(22);
        list.add(23);
        list.add(2);
        list.add(2);
        
        
        //  if we know about how many 2 in our list '
        // then how can we find it 
        
        // you can create any kind of logic 
        
        int c = Collections.frequency(list, 2);
        //frequency() - returns the count of the number of times an element is present in the collection
        System.out.println("total 2 are : " + c);
    
        // if we have another collection list 
        
    
        
          ArrayList<Integer> list2 = new ArrayList<>();
         
         list2.add(300);
          // if ->  this list contains some of same value
          // then we can use disjoint() method
          
          //disjoint() - checks if two collections contain some common element
          
        boolean b = Collections.disjoint(list, list2);
        System.out.println("if disjoint() find any of common element it returns false ");
        System.out.println("two list are disjoint or no match : " + b);
        
    }
   
}
/*
run:
total 2 are : 3
if disjoint() find any of common element it returns false 
two list are disjoint or no match : true
BUILD SUCCESSFUL (total time: 0 seconds)

*/