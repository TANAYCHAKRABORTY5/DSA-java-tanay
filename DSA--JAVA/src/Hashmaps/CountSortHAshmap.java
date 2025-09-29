package Hashmaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountSortHAshmap {

    public static void countsort(int[] arr){
        if(arr== null || arr.length <=1){
            return;
        }

        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();


        Map<Integer,Integer> countMap = new HashMap<>();


        for(int i : arr){
            countMap.put(i,countMap.getOrDefault(i,0)+1);
        }

        int index=0;

        for(int i=min;i<=max;i++){
            int count = countMap.getOrDefault(i,0);
            for(int j=0;j<count;j++){
                arr[index] = i;
                index++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 10, 9, 2, 4, 9, 7};
        countsort(arr);
        System.out.println(Arrays.toString(arr));
    }


}
