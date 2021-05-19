class Solution {
    public int minMoves2(int[] nums) {
        
        int minimumMoves = 0;
        
        Arrays.sort (nums);
        
        for (int num : nums) {
            minimumMoves += Math.abs (num - nums[nums.length / 2]);
        }
        
        return minimumMoves;
    }
}