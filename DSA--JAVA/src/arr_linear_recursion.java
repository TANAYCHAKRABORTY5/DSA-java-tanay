import java.util.ArrayList;

public class arr_linear_recursion {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,6,8};
//        System.out.println(search(arr,6,0));
//        find(arr,6,0);
//        System.out.println(list);

        ArrayList<Integer> ans = find(arr,6,0,new ArrayList<>());
        System.out.println(ans);
    }

    //for showing multiple values

    static int search(int[] arr,int target,int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] ==target){
            return index;
        }else {

            return search(arr,target,index+1);
        }

    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void find(int[] arr,int target,int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        find(arr,target,index+1);
    }

    static ArrayList<Integer> find(int[] arr,int target,int index,ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return find(arr,target,index+1,list);
    }
}
