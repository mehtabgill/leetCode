// For example, if you've got the list , sort it as  to see that several pairs have the minimum difference of : . The return array would be .
// Given a list of unsorted integers, , find the pair of elements that have the smallest absolute difference between them. If there are multiple pairs, find them al

// https://www.hackerrank.com/challenges/closest-numbers/problem


public class Solution {

    // Complete the closestNumbers function below.
    static int[] closestNumbers(int[] arr) {
        int min = Integer.MAX_VALUE;
        Arrays.sort(arr);

        List<Integer> result = new ArrayList<Integer>();;
        for(int i=1; i < arr.length ; i++){
            int diff = arr[i] - arr[i-1];
            if(diff > min){
                continue;
            }
            else if(diff < min){
                result.clear();
                min = diff;
            }
            result.add(arr[i-1]);
            result.add(arr[i]); 
        }
        int array[] = new int[result.size()];
        for(int i=0; i < result.size(); i++){
            array[i]=result.get(i);
        }
        return array;

    }