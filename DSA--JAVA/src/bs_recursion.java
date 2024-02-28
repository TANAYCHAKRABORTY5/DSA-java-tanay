public class bs_recursion {
    public static void main(String[] args) {
        int[] arr={1,2,4,7,9,23,45,67,89,90};
        int target=230;
        System.out.println(search(arr,target,0,arr.length-1));
    }
    static int search(int[] arr,int target,int s,int e){
        if(s>e){
            return -1;
        }

        int m=s+(e-s)/2;

        if(arr[m] == target){
            return m;
        }
        if (arr[m] < target){
            return search(arr,target,m+1,e);
        }
        return search(arr,target,s,m-1);

    }
}
