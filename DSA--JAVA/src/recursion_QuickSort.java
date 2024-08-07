import java.util.Arrays;

public class recursion_QuickSort {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        sort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }


    static void sort(int[] nums,int low ,int hi){

        if(low >=hi){
            return;
        }

        int s=low;
        int e=hi;
        int m = s+(e-s)/2;
        int p = nums[m];

        while(s<=e){
            while(nums[s]<p){
                s++;
            }
            while(nums[e]>p){
                e--;
            }

            if(s>=e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] =temp;
                s++;
                e--;
            }

        }
        sort(nums,low,e);
        sort(nums,s,hi);
    }
}
