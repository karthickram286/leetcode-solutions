class Solution {
    public int rob(int[] nums) {
        
        int n = nums.length;
        
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);
        
        // Even numbers -> From 0 to n-1
        int even = hrb(0, n-1, nums);
        
        // Odd number -> From 1 to n
        int odd = hrb(1, n, nums);
        
        return Math.max(even, odd);
    }
    
    public int hrb(int start, int end, int[] nums) {
        int[] dp = new int[end];
        dp[start] = nums[start];
        
        dp[start + 1] = Math.max(nums[start], nums[start + 1]);
                
        for (int i = start + 2; i < end; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i]);
        }
        
        return dp[dp.length - 1];
    }
}