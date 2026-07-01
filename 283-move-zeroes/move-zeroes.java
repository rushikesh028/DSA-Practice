class Solution {
    public void moveZeroes(int[] nums) {
        int insertPos = 0;
        
        for (int i = 0; i < nums.length; i++) {
            // If the current element is non-zero
            if (nums[i] != 0) {
                // Swap elements at i and insertPos
                int temp = nums[i];
                nums[i] = nums[insertPos];
                nums[insertPos] = temp;
                
                // Move the insertion pointer forward
                insertPos++;
            }
        }
    }
}