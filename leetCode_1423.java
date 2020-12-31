class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int maxReach = cardPoints.length - k;
    
        int curSum = 0;
        int totSum = 0;
        
        for(int i=0; i < maxReach ; i++){
            curSum += cardPoints[i];
            totSum += cardPoints[i];
        }
        int res = curSum;
        int left = 0;
        
        for(int i=maxReach ; i < cardPoints.length; i++){
            
            curSum -= cardPoints[left++];
            curSum += cardPoints[i];
            totSum += cardPoints[i];
            res = Math.min(curSum, res);
        }
        
        return totSum - res;
        
    }
}