class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int max = 0;
        int current = 0;
        for (int num : nums) {
            if (num == 0) {
                max = Math.max(max, current);
                current = 0;
            } else {
                current++;
            }
        }
        return Math.max(max, current);
    }
}