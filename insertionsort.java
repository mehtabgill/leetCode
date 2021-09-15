public class InsertionSort {

    public void insertionSort(int arr[]){
                for(int i=1; i < arr.length ; i++){
                    int key = arr[i];
                    int prev = i-1;

                    while(prev >=0 && key < arr[prev]){
                        arr[prev+1] = arr[prev];
                        prev--;
                    }
                    arr[prev+1] = key;
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
        // int arr[] = { 12}; 
        int arr[] = { 1, 2, 3}; 
  
        InsertionSort ob = new InsertionSort(); 
        ob.insertionSort(arr); 
  
        printArray(arr); 
    } 


}