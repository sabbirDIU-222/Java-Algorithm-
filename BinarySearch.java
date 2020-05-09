
package javaalgorithm;

public class BinarySearch {
    // Binary search using recursion
    
    public int BinarySrc(int arr[] ,int left,int right,int key)
    {
        while(right>=left)
        {
            int middle = (left+right)/2;
            
            
            if(arr[middle]==key)
            {
                return middle;
            }
            
            else if(arr[middle] < key)
            {
                return BinarySrc(arr,middle+1,right,key);
            }
            else
                return BinarySrc(arr,left,middle-1,key);
        }
        
        return -1;
    }
    
    
    public static void main(String[] args) {
        
       
        BinarySearch obj = new BinarySearch();
        
        int arr[]={2,3,4,5,6,7,8};
        int left = 0;
        int right = arr.length;
        int key = 4;
        
      int result =   obj.BinarySrc(arr, left, right-1, key);
        
       if(result == -1)
       {
           System.out.println("din't find");
       }
       else
       {
           System.out.println("find it at index number : "  + result);
       }
        
        
    }
    
    
}

    
    

/*int left = 0;
        int right = arr.length - 1;
        
        while(left <= right)
        {
            int middle = (left + right)/2;
            
            if(arr[middle]==key)// this is the main things 
            {
                return middle;
            }
            
            else if(arr[middle] < key)
            {
                left = middle + 1;
            }
            
            else
            {
                right = middle -1;
            }
        }
        
        return -1;
        
    }
    
    
    public static void main(String[] args) {
        
        BinarySearch obj = new BinarySearch();
        int arr[]={2,3,9,20,33,40,60};
        int n  = arr.length;
        
        
        int result = obj.binarySrc(arr, 20);
        
        if(result == -1)
        {
            System.out.println("your number is not found in this list");
        }
        else
            System.out.println("number foound in index number : " + result);
        
    }*/



/*public int BrnSrc(int arr[],int l,int r,int key)
    {
        while(r>=l)
        {
            int middle = (l+r)/2;
            
            if(arr[middle]==key)
            {
                return middle;
            }
             if(arr[middle] > key)
            {
                return BrnSrc(arr,l,middle-1,key);
            }
            
                return BrnSrc(arr,middle+1,r,key);
        }
        return -1;

        
        
    }
    
    public static void main(String[] args) {
        BinarySearch obj = new BinarySearch();
        int arr[]={10,20,30,40,50};
        int key =30;
        int r = arr.length;
        
        int result = obj.BrnSrc(arr, 0, r-1,key);
        if(result == -1 )
            System.out.println("not found ");
        else
            System.out.println("found in index number : " + result);
            
    }*/