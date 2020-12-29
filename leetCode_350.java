class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> ll = new ArrayList<>();
        
        for(int i=0; i < nums1.length; i++){
            map.putIfAbsent(nums1[i], 0);
            int c = map.get(nums1[i]); c++;
            map.put(nums1[i], c);
        }
        
        for(int i=0; i<nums2.length; i++){
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0){
                ll.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i])-1);
            }
        }
        
        
        int[] result = new int[ll.size()];
        
        for(int i=0; i < result.length; i++){
            result[i] = ll.get(i);
        }
        
        return result;
    }
}