class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int current = 0;
            for (int j = i; j < n; j++) {
                if (nums[j] == 0)
                    break;
                current++;
                max = Math.max(current, max);
            }
        }
        return max;
    }
}