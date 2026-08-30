class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Understand → Clarify → Example → Brute force
        // → Optimize → Complexity → Code → Test

        // hash map
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // sort hash map
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((a, b) -> Integer.compare(b.getValue(), a.getValue()));

        // return result

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i).getKey();
        }
        return result;
    }
}
