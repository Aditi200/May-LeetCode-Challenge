class Solution {
    
    int total = 0;
    
    private boolean isValidPlace(int row, int col, int n, boolean flag[][]) {
        for(int i = row-1, j = 1; i >= 0; i--, j++) {
            if(flag[i][col] || (col-j >= 0 && flag[i][col-j]) || (col+j < n && flag[i][col+j]) ) {
                return false;
            }
        }
        return true;
    }
    
    private void solve(int n, int current, boolean flag[][]) {
        if(current == n) {
            total++;
            return;
        }
        for(int i = 0; i < n; i++) {
            if(isValidPlace(current, i, n, flag)) {
                flag[current][i] = true;
                solve(n, current + 1, flag);
                flag[current][i] = false;
            }
        }
    }
    
    public int totalNQueens(int n) {
        total = 0;
        solve(n, 0, new boolean[n][n]);
        return total;
    }
}