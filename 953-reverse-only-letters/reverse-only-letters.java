class Solution {
    public String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            // Move left pointer if it's not a letter
            if (!Character.isLetter(chars[left])) {
                left++;
            } 
            // Move right pointer if it's not a letter
            else if (!Character.isLetter(chars[right])) {
                right--;
            } 
            // Both are letters, swap them
            else {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        
        return new String(chars);
    }
}