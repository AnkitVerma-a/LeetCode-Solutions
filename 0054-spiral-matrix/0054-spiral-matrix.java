class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ls = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return ls;
        }
        int m = matrix.length;    
        int n = matrix[0].length; 
        int top = 0;
        int bottom = m - 1;       
        int left = 0;
        int right = n - 1;        
        while (top <= bottom && left <= right) {
            // 1. Move Right
            for (int i = left; i <= right; i++) {
                ls.add(matrix[top][i]);
            }
            top++;
            // 2. Move Bottom
            for (int i = top; i <= bottom; i++) {
                ls.add(matrix[i][right]);
            }
            right--;
            // 3. Move Left 
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ls.add(matrix[bottom][i]);
                }
                bottom--;
            }
            // 4. Move Top 
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ls.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ls;
    }
}
