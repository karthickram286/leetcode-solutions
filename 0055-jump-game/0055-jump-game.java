class Solution {
    public boolean canJump(int[] nums) {
        int maxJump = 0;
        
        for (int i = 0; i < nums.length; i++) {
            
            if (i <= maxJump) {
                int currentJump = i + nums[i];
                maxJump = Math.max(currentJump, maxJump);
            } else
                return false;
            
            if (maxJump >= nums.length - 1)
                return true;
        }
        
        return false;
    }
}