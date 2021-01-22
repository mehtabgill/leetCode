public class MergeSort {

    void merge(int[] arr, int s, int m, int e){
        int n1 = m-s+1;
        int n2 = e-m;

        int[] left = new int[n1];
        int[] right = new int[n2];
        for(int i=0; i < n1; i++){
            left[i] = arr[s+i];
        }
        for(int i=1; i <=n2; i++){
            right[i-1] = arr[m+i];
        }

        int l =0, r=0;
        int k=s;
        while(l < n1 && r < n2){
            if(left[l] <= right[r]){
                arr[k] = left[l];
                l++;
            }else{
                arr[k] = right[r];
                r++;
            }
            k++;
        }
        while(l < n1){
            arr[k++]= left[l++];
        }
        while(r < n2){
            arr[k++] = right[r++];
        }

    }



    void sort(int[] arr, int s, int e){
        if(s < e){
            int m = (s+e)/2;

            sort(arr, s, m);
            sort(arr, m+1, e);
            merge(arr, s, m, e);
        }
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