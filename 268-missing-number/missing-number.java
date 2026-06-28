class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        // 1. Added 'int' to declare i
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        
        // 2. Added '=' operator
        int actualSum = (nums.length * (nums.length + 1)) / 2;
        
        int missingnum = actualSum - sum;
        
        // 3. Added missing semicolon
        return missingnum; 
    }
}