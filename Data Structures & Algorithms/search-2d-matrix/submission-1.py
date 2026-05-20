class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        l,r = 0, len(matrix)-1
        lMatrix = len(matrix[0])-1
        m = 0
        while l <= r:
            m = (l+r)//2
            if target < matrix[m][0]:
                r = m - 1
            elif target > matrix[m][lMatrix]:
                l = m + 1
            else:
                break
        l, r = 0, lMatrix
        row = m
        while l <= r:
            mid = (l+r)//2
            if target < matrix[row][mid]:
                r = mid - 1
            elif target > matrix[row][mid]:
                l = mid + 1
            elif target == matrix[row][mid]:
                return True
            else:
                return False
        return False