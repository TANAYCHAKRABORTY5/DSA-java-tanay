package Capgemini_Practise_Questions.DsaTypeQues;

//Implement binary search on a sorted array.


public class Q1 {

    public static int binarySearch(int[] arr,int k){

        int s =0,e=arr.length -1;

        while(s <= e){
            int mid = s + (e-s)/2;

            if(arr[mid] == k) return mid;
            else if(arr[mid] > k) e = mid-1;
            else s = mid+1;
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int index =binarySearch(arr,6);

        if(index == -1){
            System.out.println("Element not present");
        }else {
            System.out.println("Element present at index : " + index);
        }

    }
}
