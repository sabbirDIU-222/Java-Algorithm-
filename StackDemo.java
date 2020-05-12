
package javaalgorithm;

import java.util.EmptyStackException;
import java.util.Stack;


public class StackDemo {
    public static void main(String[] args) {
        
        Stack<String> stack = new Stack<>();
        
        stack.push("bottom");
        stack.push("bottom up");
        stack.push("bottom upper");
        stack.push("upper");
        stack.push("first");
        
        
        System.out.println("stack are look like : "  + stack);
        System.out.println();
        
        String p = stack.pop();
        System.out.println("stack.pop() : remove first  : " + p);
        try
        {
            String d = stack.pop();
            System.out.println("now " + d + " gone " );
            
        }
        catch(EmptyStackException e)// that pop method gives EmptyStackException that we handle it
        {
            System.out.println(e);
        }
        
        System.out.println("\n"+ stack + "\n");
        
        String f = stack.peek();// it  return the top element without removing it 
        // from stack
        System.out.println("at the top element at stck : " + f) ;
        
        stack.push("first");
        printstack(stack);
        
      int id =   stack.search("bottoms");
            if(id!=-1)
            {
                System.out.println("stack found it in position : " + id);
            }
            else
                System.out.println("it is not in stack");
    }
    
    
    private static void printstack(Stack<String> s)
    {
        
        if(s.isEmpty())
            System.out.println("stack is empty");
        else
            System.out.println("rest of the : " + s);
        System.out.println("size of the stack : " + s.size() + "\n");
    }
}



/***
 output
 
 * 
 * run:
stack are look like : [bottom, bottom up, bottom upper, upper, first]

stack.pop() : remove first  : first
now upper gone 

[bottom, bottom up, bottom upper]

at the top element at stack : bottom upper
rest of the : [bottom, bottom up, bottom upper, first]
size of the stack : 4

it is not in stack
BUILD SUCCESSFUL (total time: 0 seconds)

 **/