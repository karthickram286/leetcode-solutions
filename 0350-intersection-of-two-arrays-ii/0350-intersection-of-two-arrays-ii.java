class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        
        for (int n : nums1) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
        for (int n : nums2) {
            int count = map.getOrDefault(n, 0);
            if (count > 0) {
                result.add(n);
                map.put(n, count - 1);
            }
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}