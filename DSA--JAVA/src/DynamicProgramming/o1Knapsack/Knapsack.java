package DynamicProgramming.o1Knapsack;

public class Knapsack {

    public static int KnapsackAlgoo(int[] weights,int[] values,int capacity){
        int n = weights.length;
        int[] dp = new int[capacity+1];

        for(int i = 0;i<n;i++){
            for(int w=capacity;w>=weights[i];w--){
                dp[w] = Math.max(dp[w],values[i] + dp[w-weights[i]]);

            }
        }
        return dp[capacity];
    }

    public static void main(String[] args) {
        int[] weights = {1, 3, 4, 6};
        int[] values = {20,30,10,50};
        int capacity = 10;

        int maxProfit = KnapsackAlgoo(weights,values,capacity);
        System.out.println("Maximum profit  : "+ maxProfit );
    }
}
