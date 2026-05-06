class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        ROW, COLUMN = len(matrix) -1, len(matrix[0]) -1

        top, bot = 0, ROW
        while top <= bot:
            mid = (top + bot) //2
            if target < matrix[mid][0]:
                bot = mid - 1
            elif target > matrix[mid][-1]:
                top = mid + 1
            else:
                break

        row = (top+bot)//2
        left, right = 0, COLUMN
        while left <= right:
            mid = (left+right)//2
            if(target < matrix[row][mid]):
                right = mid - 1
            elif(target > matrix[row][mid]):
                left = mid + 1
            else:
                return True
        return False