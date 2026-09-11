class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        maxNum = 0;
        curr = 0;
        for num in nums:
            if num == 1:
                curr = curr + 1
                if curr >= maxNum:
                    maxNum = curr
            else:
                if curr >= maxNum:
                    maxNum = curr
                    curr = 0
                else:
                    curr = 0
        return maxNum