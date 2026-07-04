class Solution {
    public int minimumSwaps(int[] nums) {
        int nonZeroCount = 0;
        
        // Step 1: Count total non-zero elements
        for (int num : nums) {
            if (num != 0) {
                nonZeroCount++;
            }
        }
        
        // Step 2: Count how many zeros are in the prefix window of size nonZeroCount
        int swaps = 0;
        for (int i = 0; i < nonZeroCount; i++) {
            if (nums[i] == 0) {
                swaps++;
            }
        }
        
        return swaps;
    }
}