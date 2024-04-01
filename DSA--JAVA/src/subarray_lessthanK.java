import java.util.Arrays;

public class subarray_lessthanK {
    public static void main(String[] args) {
        int[] nums = {10,5,2,6};
        int k=100;
        int a = subarr(nums,k);
        System.out.println(a);
    }

    static int subarr(int[] nums,int k){
        if (k<=1){
            return 0;
        }

        int product=1,left=0,ans=0;
        for(int right =0;right<nums.length;right++){
            product *=nums[right];
            while(product >= k){
                product/=nums[left++];
            }
            ans+= right - left + 1;
        }
        return ans;
    }
}
