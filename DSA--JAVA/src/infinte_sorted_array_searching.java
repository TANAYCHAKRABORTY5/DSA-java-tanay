public class infinte_sorted_array_searching {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,9,10,11,12,13,15,17,19,23,34,45};

        int target= 3;
        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr, int target){
        int start = 0 ;
        int end = 1;
        while(target > arr[end]){
            int newstart= end+1;
            end = end+(end-start +1)*2;
            start =newstart;
        }
        int anss= binary(arr,target,start,end);
        return anss;
    }
    static int binary(int[] arr, int target,int start , int end){

        while (start<=end){
            int mid = start +(end - start)/2;
            if (target<arr[mid]){
                end = mid-1;
            } else if (target > arr[mid]) {
                start=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
