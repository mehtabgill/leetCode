public class SelectionSort{

    void sort(int arr[]){

        for(int i=0; i<arr.length-1; i++){
            int index = i;
            //find min
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] < arr[index]){
                    index=j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index] ;
            arr[index] = temp;
        }
    }

    
    // Prints the array 
    void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
    
    // Driver code to test above 
    public static void main(String args[]) 
    { 
        SelectionSort ob = new SelectionSort(); 
        int arr[] = {64,25,12,22,11}; 
        ob.sort(arr); 
        System.out.println("Sorted array"); 
        ob.printArray(arr); 
    }
}