public class Solution{
    public static int getClosetNumberOfTarget(int[] nums, int target){
        if(nums.length == 1) return -1;
        if(target <= nums[0]) return nums[0];
        if(target >= nums[nums.length-1]) return nums[nums.length-1];

        int left =0, right=nums.length-1;
        while(right - left != 1){
            int mid = left + (right-left)/2;
            if(target == nums[mid]) return mid;
            else if(target > nums[mid]) left = mid;
            else{
                right = mid;
            }
        }

        return Math.abs(target-nums[left]) <= Math.abs(target-nums[right]) ? nums[left] : nums[right];
    }

    public static void main(String[] args) {
 
		int b[] = { 1, 2, 4, 5, 6, 20, 26, 30 };
		System.out.println(getClosetNumberOfTarget(b, 11));
		System.out.println(getClosetNumberOfTarget(b, -5));
		System.out.println(getClosetNumberOfTarget(b, 27));
		System.out.println(getClosetNumberOfTarget(b, 23));
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		int c[] = { 1, 2, 4, 5, 6, 20, 26 };
		System.out.println(getClosetNumberOfTarget(c, 11));
		System.out.println(getClosetNumberOfTarget(c, -5));
		System.out.println(getClosetNumberOfTarget(c, 27));
		System.out.println(getClosetNumberOfTarget(c, 23));
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		int e[] = { 16, 19, 26, 34, 51, 98, 256 };
		System.out.println(getClosetNumberOfTarget(e, 30));
		System.out.println(getClosetNumberOfTarget(e, 31));
		System.out.println(getClosetNumberOfTarget(e, 27));
		System.out.println(getClosetNumberOfTarget(e, 23));
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		int a[] = { -10, -6, 6, 14, 41, 58, 99 };
		System.out.println(getClosetNumberOfTarget(a, -8));
		System.out.println(getClosetNumberOfTarget(a, 0));
		System.out.println(getClosetNumberOfTarget(a, 27));
		System.out.println(getClosetNumberOfTarget(a, 10));
	}
}