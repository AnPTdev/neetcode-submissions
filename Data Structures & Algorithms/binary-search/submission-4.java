class Solution {
    public int search(int[] nums, int target) {
        int L = 0;
        int R = nums.length - 1;
        int middle = (L + R) / 2;

        while (L <= R) {
            if (nums[middle] < target) {
                L = middle + 1;
                middle = (L + R) / 2;
            } else if (nums[middle] > target) {
                R = middle - 1;
                middle = (L + R) / 2;
            } else {
                return middle;
            }
        }

        return -1;
    }
}
