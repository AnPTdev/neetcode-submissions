class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        h = set()
        L = 0
        for R in range(len(nums)):
            if R - L > k:
                h.remove(nums[L])
                L+=1
            if nums[R] in h:
                return True
            h.add(nums[R])
        return False