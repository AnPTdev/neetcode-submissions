class Solution:
    def numOfSubarrays(self, arr: List[int], k: int, threshold: int) -> int:
        threshold = threshold*k
        L = 0
        res = 0
        SUM = 0
        for R in range(len(arr)):
            SUM += arr[R]
            
            if R - L + 1 == k:
                if SUM >= threshold:
                    res += 1

                needToRemove = arr[L]
                SUM -= needToRemove
                L+=1
        return res