class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        
        if (nums.length == 1)
            return nums[0];
        
        // This means the array is not sorted
        if (nums[right] > nums[left])
            return nums[0];
        
        while (left <= right) {
            int mid = left + ((right - left) / 2);
            
            System.out.println(nums[left] + " " + nums[mid] + " " + nums[right]);
            
            if (nums[mid] > nums[mid + 1])
                return nums[mid + 1];
            else if (nums[mid] < nums[mid - 1])
                return nums[mid];
            
            if (nums[mid] > nums[0]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1;
    }
}