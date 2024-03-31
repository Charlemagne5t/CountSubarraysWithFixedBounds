class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int n = nums.length;
        long res = 0L;
        int start = 0;
        int minWCount = 0;
        int maxWCount = 0;
        int lastSeenMin = -1;
        int lastSeenMax = -1;
        for(int i = 0; i <= n; i++){
            if(i == n ||nums[i] > maxK || nums[i] < minK ){
                minWCount = 0;
                maxWCount = 0;
                start = i + 1;
                continue;
            }

            if( nums[i] == maxK){
                lastSeenMax = i;
                maxWCount++;
            }
            if( nums[i] == minK){
                lastSeenMin = i;
                minWCount++;
            }
            if(minWCount > 0 && maxWCount > 0){
                res += Math.min(lastSeenMin, lastSeenMax) - start + 1;
            }
        }


        return res;
    }
}