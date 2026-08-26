class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            int n = matrix[i].length;
            if (matrix[i][n - 1] == target) {
                return true;
            } else if (matrix[i][n - 1] > target) {
                int L = 0;
                int R = n - 1;
                int middle = (L + R) / 2;
                while (L <= R) {
                    if (matrix[i][middle] < target) {
                        L = middle + 1;
                        middle = (L + R) / 2;
                    } else if (matrix[i][middle] > target) {
                        R = middle - 1;
                        middle = (L + R) / 2;
                    } else {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
