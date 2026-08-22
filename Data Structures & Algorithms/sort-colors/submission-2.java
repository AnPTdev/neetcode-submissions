class Solution {
    public void sortColors(int[] nums) {

     HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int key = nums[i];
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        int index = 0;
        for(int i = 0; i <= 2 ; i ++){
            int times = map.getOrDefault(i, 0);
            while(times > 0){
                nums[index] = i;
                index++;
                times--;
            }
        }
    }
}