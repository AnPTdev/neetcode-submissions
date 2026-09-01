class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        count = max_count = 0
        for num in nums:
            if num == 0:
                count = 0
            else:
                count = count + 1
            max_count = max(max_count, count)
        return max_count
