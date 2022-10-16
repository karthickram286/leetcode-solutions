class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        // Calculating the product of all numbers to the left side
        // of the current index
        int leftProduct = nums[0];
        result[0] = 1;      // Because there are no numbers to the left of 0
        for (int i = 1; i < nums.length; i++) {
            result[i] = leftProduct;
            leftProduct = leftProduct * nums[i];
        }
                
        // Calculating the product of all numbers to the right side
        // of the current index and also multiplying it with the already
        // calculated left product
        int rightProduct = nums[n-1];
        for (int i = n - 2; i >= 0; i--) {
            result[i] = result[i] * rightProduct;
            rightProduct = rightProduct * nums[i];
        }
        
        return result;
    }
}