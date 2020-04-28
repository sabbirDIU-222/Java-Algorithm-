
package hello;


public class LinearSearch {
    // sometimes we need to find out any array of any specefic value
    // then how can we find it ??
    // here is the logic of linear search 
    // we simply using a method 
    // that takes to perameter 
    // one of array and another of our destination 
    // .....................let's start ...............
    
    public static int  linear_search(int arr[], int key)// two local variable 
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
               return i;
            }
        }
        return -1;
    }
    
    
    
    
    public static void main(String[] args) {
        int[] arr = new int[]{10,20,30,40,50,6,70,80};
        int k = 6;
        
        System.out.println("k is in the index of : " + linear_search(arr,k));
               
        
    }
}

/*
output
run:
k is in the index of : 5
BUILD SUCCESSFUL (total time: 0 seconds)


*/
