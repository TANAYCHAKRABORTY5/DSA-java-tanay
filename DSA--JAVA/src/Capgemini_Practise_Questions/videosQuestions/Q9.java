package Capgemini_Practise_Questions.videosQuestions;


import java.util.ArrayList;
import java.util.Arrays;

class Source{
    public ArrayList<String> changeOccurence(ArrayList<String> a,String m, String n){
        for(int i=0;i<a.size();i++){
            if(a.get(i).equals(m)){
                a.set(i,n);
            }
        }
        return a;
    }

    public String listIndex(ArrayList<String> list){
        return list.get(0);
    }

    public ArrayList<String> listAfter(ArrayList<String> a, String m,String n){
        for(int i=0;i<a.size();i++){
            if(a.get(i).equals(m)){
                a.add(i+1,n);
                i++;
            }
        }
        return a;
    }
}


public class Q9 {

    public static void main(String[] args) {
        Source s = new Source();

        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("cherry");

        System.out.println("original list : " + list);

        ArrayList<String> changed = s.changeOccurence(new ArrayList<>(list),"apple","mango");

        String firstElement = s.listIndex(list);
        System.out.println("ListIndex : "+firstElement);


        ArrayList<String> after = s.listAfter(new ArrayList<>(list),"banana","grapes");
        System.out.println("After : "+after);
    }
}
