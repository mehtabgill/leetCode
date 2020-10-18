

public class BubbleSort {

    void bubbleSort(int arr[]){
        
        while(true){
            boolean end=true;
            for(int i=0; i<arr.length-2;i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1]=temp;
                    end=false;
                }
            }
            if(end){
                break; 
            }
        }

    }

     /* Prints the array */
     void printArray(int arr[]) 
     { 
         int n = arr.length; 
         for (int i=0; i<n; ++i) 
             System.out.print(arr[i] + " "); 
         System.out.println(); 
     } 


    public static void main(String args[]){
        BubbleSort ob = new BubbleSort(); 
        int arr[] = {64, 34, 25, 12, 22, 11, 90}; 
        ob.bubbleSort(arr); 
        System.out.println("Sorted array"); 
        ob.printArray(arr); 
    }
}