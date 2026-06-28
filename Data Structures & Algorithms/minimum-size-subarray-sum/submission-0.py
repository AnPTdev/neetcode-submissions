class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        length = float('inf')
        Sum = 0
        L = 0
        for R in range(len(nums)):
            Sum += nums[R]
            while Sum >= target:
                length = min(length, R - L + 1)
                Sum -= nums[L]
                L +=1
        return 0 if length == float('inf') else length