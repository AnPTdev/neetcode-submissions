class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int max = 0;
        for (int item : set) {
            int temp = 1;
            int i = 1;
            if (!set.contains(item - 1)) {
                while (set.contains(item + i)) {
                    temp++;
                    i++;
                }
                max = Math.max(max, temp);
            }

            // temp = 0;
            // i = 1;
            // while (set.contains(item - i)) {
            //     temp--;
            //     i--;
            // }
            // max = Math.max(max, temp);
        }

        return max;
    }
}
