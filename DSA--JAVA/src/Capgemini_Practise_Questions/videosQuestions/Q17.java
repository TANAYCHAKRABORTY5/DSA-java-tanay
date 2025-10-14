package Capgemini_Practise_Questions.videosQuestions;


import java.util.ArrayList;
import java.util.Arrays;

class Source1{
    public int sum(ArrayList<Integer> numbers){
        int sum = 0;
        for(int i=0;i<numbers.size();i++){
            sum += numbers.get(i);
        }
        return sum;
    }

    public ArrayList<Integer> splitAndReverse(ArrayList<Integer> list){
        int n = list.size();
        ArrayList<Integer> arr = new ArrayList<>();
        int mid = (n+1)/2;

        for(int i = mid-1;i>=0;i--){
            arr.add(list.get(i));
        }

        for(int i=n-1;i>=mid;i++){
            arr.add(list.get(i));
        }

        return arr;
    }

    public Integer getItemAtIndex(ArrayList<Integer> list,int x){
        if( x <0 || x >= list.size()){
            return null;
        }

        return list.get(x);
    }
}

public class Q17 {
    public static void main(String[] args) {
        Source1 s = new Source1();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Sum: " + s.sum(list)); // 15
        System.out.println("Item at index 2: " + s.getItemAtIndex(list, 2)); // 3
        System.out.println("Split and Reverse: " + s.splitAndReverse(list)); // [3, 2, 1, 5, 4]
    }
}
