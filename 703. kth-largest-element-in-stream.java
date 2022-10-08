class KthLargest {
    
    private PriorityQueue<Integer> heap;
    private int n;

    public KthLargest(int k, int[] nums) {
        // Creating a min heap. The idea is to add all values and exclude the values until 
        // the size of heap is k
        heap = new PriorityQueue<>();
        n = k;
        
        // Adding all values
        for (int num : nums)
            heap.add(num);
        
        // Removing values until size = k
        while(heap.size() > k)
            heap.poll();
    }
    
    public int add(int val) {
        // The current size is k. If a new value comes in it will be pushed to the heap
        // and then we will remove the top of heap. So, the top of heap will always 
        // have the kth largest value
        heap.add(val);
        if (heap.size() > n) {
            heap.poll();
        }
        return heap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
