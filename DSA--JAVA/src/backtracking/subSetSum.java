package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class subSetSum {

    static void subsetSumHelper(int i,int sum,ArrayList<Integer> ans,int n,ArrayList<Integer> arr){
        if(i == n){
            ans.add(sum);
            return;
        }
        //pick
        subsetSumHelper(i+1,sum + arr.get(i),ans,n,arr);

        //don't pick
        subsetSumHelper(i+1,sum,ans,n,arr);
    }

    static ArrayList<Integer> subsetSums(ArrayList<Integer> arr,int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        subsetSumHelper(0,0,ans,n,arr);
        Collections.sort(ans);
        return ans;
    }
    public static void main(String[] args) {
        ArrayList< Integer > arr = new ArrayList<>();
        arr.add(3);
        arr.add(1);
        arr.add(2);
        ArrayList < Integer > ans = subsetSums(arr, arr.size());
        Collections.sort(ans);
        System.out.println("The sum of each subset is ");
        for (int i = 0; i < ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }
    }
}
