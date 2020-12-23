public class MergeSort {

    void merge(int arr[], int s, int m, int e){
        int rhsCounter=m+1;
        for(int i=s; i<=m; i++){
            if(arr[i]>arr[rhsCounter]){
                int temp = arr[i];
                arr[i] = arr[rhsCounter];
                arr[rhsCounter]=temp;
                
            }
            if(rhsCounter == e){
                break;
            }
            rhsCounter++;
        }

    }

    void sort(int arr[], int s, int e){
        if(s >= e){
            return;
        }
        int m = (s+e)/2;
        sort(arr, s, m);
        sort(arr, m+1, e);
        merge(arr,s, m, e);
    }
    
    
    
    
    /* A utility function to print array of size n */
     static void printArray(int arr[]) 
     { 
         int n = arr.length; 
         for (int i = 0; i < n; ++i) 
             System.out.print(arr[i] + " "); 
         System.out.println(); 
     } 
   
     // Driver method 
     public static void main(String args[]) 
     { 
         int arr[] = { 12, 11, 13, 5, 6, 7 }; 
   
         System.out.println("Given Array"); 
         printArray(arr); 
   
         MergeSort ob = new MergeSort(); 
         ob.sort(arr, 0, arr.length - 1); 
   
         System.out.println("\nSorted array"); 
         printArray(arr); 
     }  


}