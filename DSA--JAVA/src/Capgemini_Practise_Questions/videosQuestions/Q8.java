package Capgemini_Practise_Questions.videosQuestions;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Employee{
    public String name;
    public String projectName;
    public int workingHrs;
    public int bonus;

    Employee(String name,String projectName, int working){
        this.name = name;
        this.projectName = projectName;
        this.workingHrs = working;
        this.bonus = 0;
    }

    public Employee() {}

    public String setBonus(){
        String[] ls = {"web","tech","hack","SD","PD"};
        List<String> list = Arrays.asList(ls);
        if(list.contains(projectName) && workingHrs >= 30){
            bonus = workingHrs/10;
           return "Congrats";
        }
        return "Work hard";
    }

    public String checkName(){
        if(name.equals("doselect")){
            return projectName + workingHrs;

        }
        return projectName+ bonus;
    }
}



public class Q8 {
    public static void main(String[] args) {
        Employee e = new Employee();

        e = new Employee("doselect","hack",45);

        System.out.println(e.setBonus());
        System.out.println(e.checkName());

    }
}
