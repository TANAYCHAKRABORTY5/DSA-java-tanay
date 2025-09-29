package DynamicProgramming.Questions;

public class MatrixChainMulti {

    static int matrixMulti(int n,int a[]){
        int[][] dp = new int[n][n];
        for (int len = 2; len <n ; len++) {
            for (int row = 0,col = len; row < n-len;  row++,col++) {
                dp[row][col] = Integer.MAX_VALUE;
                for (int i = row+1; i <col ; i++) {
                    dp[row][col]=Math.min(dp[row][col],
                            dp[row][i]+dp[i][col] +
                            a[row]*a[i]*a[col]);
                }
            }
        }
        return dp[0][n-1];
    }
}
