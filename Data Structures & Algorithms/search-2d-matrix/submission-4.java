class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int L = 0;
        int R = m * n - 1;
        while (L <= R) {
            int middle = L + (R - L) / 2;
            int row = middle / n;
            int col = middle % n;
            if (matrix[row][col] < target) {
                L = middle + 1;
            } else if (matrix[row][col] > target) {
                R = middle - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
