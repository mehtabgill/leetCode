/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    HashMap<TreeNode, Integer> map = new HashMap<>();
    List<Integer> result = new ArrayList<>();
    
    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        onPath(root, target);
        dfs(root, map.get(root), K);
        return result;
    }
    
    public int onPath(TreeNode root, TreeNode target){
        
        if(root == null) return -1;
        if(root == target){
            map.put(root, 0);
            return 0;
        }
        int left = onPath(root.left, target);
        
        if(left >= 0){
            map.put(root, left+1);
            return left+1;
        }
    
        int right = onPath(root.right, target);
    
        if(right >= 0){
            map.put(root, right+1);
            return right+1;
        }
    
        return -1;
    }

    void dfs(TreeNode root, int length, int k){
        if(root == null ) return;
        if(map.containsKey(root)) length = map.get(root);
        if(length == k) result.add(root.val);
        dfs(root.left, length+1, k);
        dfs(root.right, length+1, k);
    }
}