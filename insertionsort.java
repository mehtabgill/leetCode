public class InsertionSort {

    public void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int index = i;
            for(int j=i-1; j>=0; j--){
                if(arr[i] > arr[j]){
                    break;
                }
                index--;          
            }
            // move up elements
            int temp=arr[i];
            for(int j=index; j<=i; j++){
                int innerTemp = temp;
                temp=arr[j];
                arr[j]=innerTemp;

            }
        }
    }

    /* A utility function to print array of size n*/
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
        int arr[] = { 12}; 
        // int arr[] = { 3, 2, 1 }; 
  
        InsertionSort ob = new InsertionSort(); 
        ob.insertionSort(arr); 
  
        printArray(arr); 
    } 


}