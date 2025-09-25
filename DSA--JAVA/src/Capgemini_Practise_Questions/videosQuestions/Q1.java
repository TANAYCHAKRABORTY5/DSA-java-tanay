package Capgemini_Practise_Questions.videosQuestions;

import java.util.HashMap;

class Salary {

    HashMap<String,Integer> map = new HashMap<>();


    public  int totalSalary(){
        int total = 0;
        for(int i : map.values()){
            total += i;
        }
        return total;
    }


    public  String getSalary(String designation){
        if(map.containsKey(designation)){
            return "Salary of the user is: "+ map.get(designation);
        }else{
            return "No records found";
        }
    }

    public void updateSalary(String Name,int newSal){
        if(map.containsKey(Name)){
            map.put(Name,newSal);
        }
    }
}

public class Q1{
    public static void main(String[] args) {
        Salary s = new Salary();
        s.map.put("Tanay",11000);
        s.map.put("Mohini",11000);
        s.map.put("Hero",2000);

        System.out.println(s.totalSalary());

        System.out.println(s.getSalary("Tanay"));

        s.updateSalary("Tanay",30000);
        System.out.println(s.getSalary("Tanay"));

    }
}
