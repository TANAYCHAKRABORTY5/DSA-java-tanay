package DynamicProgramming.Questions;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumSumRectangle {
    int maximumRectangle(int R,int C,int M[][]){
        int sum[] = new int[R];
        int maxSum = Integer.MIN_VALUE;
        for(int start = 0 ; start<C;start++){
            Arrays.fill(sum,0);
            for(int end = 0;end<C;end++){
                for(int row = 0;row<R;row++){
                    sum[row] += M[row][end];
                }

                int currMax = kadans(sum);
                maxSum=Math.max(maxSum,currMax);
            }
        }
        return maxSum;
    }
    int kadans(int a[]){
        int size = a.length;
        int max = Integer.MIN_VALUE,maxEnd = 0;

        for(int i=0;i<size;i++){
            maxEnd = maxEnd+a[i];
            if(max < maxEnd){
                max = maxEnd;
            }
            if(maxEnd<0) maxEnd = 0;
        }
        return max;
    }
}
