import java.sql.Array;

public class CountSort {



    public void countnsorting(int[] arr){
        if(arr==null || arr.length<=1){
            return;
        }

        int max =arr[0];

        for(int num : arr){
            if(num > max){
                max=num;
            }
        }

        int[] countarr = new int[max+1];

        for(int i : arr){
            countarr[i]++;
        }

        int index =0;
        for(int i =0;i < max ;i++){
            while(countarr[i] > 0){
                arr[index] =i;
                index++;
                countarr[i]--;
            }
        }

    }




    public static void main(String[] args) {

    }
}
