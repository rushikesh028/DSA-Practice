class Solution {
    public int findClosestNumber(int[] nums) {
        int ans = nums[0];
        
        for (int num : nums) {
            // If the current number is closer to 0, update ans
            if (Math.abs(num) < Math.abs(ans)) {
                ans = num;
            } 
            // If distances are equal, pick the larger value
            else if (Math.abs(num) == Math.abs(ans)) {
                ans = Math.max(ans, num);
            }
        }
        
        return ans;
    }
}