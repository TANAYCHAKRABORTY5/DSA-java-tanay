package Capgemini_Practise_Questions.videosQuestions;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

class definitions{

}

class Almanac{
    HashMap<String, ArrayList<String>> projects = new HashMap<>();

    public String assignProject(String name,String project){


        ArrayList<String> list = new ArrayList<>();
        if(projects.containsKey(name)){
            projects.get(name).add(project);
        }else{
            list.add(project);
            projects.put(name,list);
        }

        return "Project assigned successfully";
    }

    public ArrayList<String> currentProjects(String name){
        if(!projects.containsKey(name) || projects.get(name).isEmpty()){
            return null;
        }
        return projects.get(name);

    }

    public String finishProject(String name,String project){
        if(!projects.containsKey(name)){
            return "Not Found";
        }
        ArrayList<String> agentProjects = projects.get(name);

        if(agentProjects != null && agentProjects.contains(project)){
            return "Project finished successfully";

        }else{
            return "Not found";
        }
    }
}

public class Q6 {
    public static void main(String[] args) {

        Almanac almanac = new Almanac();

        // Assign projects
        System.out.println(almanac.assignProject("Alice", "ProjectA"));
        System.out.println(almanac.assignProject("Alice", "ProjectB"));
        System.out.println(almanac.assignProject("Bob", "ProjectX"));

        // Current projects
        System.out.println(almanac.currentProjects("Alice")); // [ProjectA, ProjectB]
        System.out.println(almanac.currentProjects("Charlie")); // null

        // Finish project
        System.out.println(almanac.finishProject("Alice", "ProjectA")); // Project finished successfully
        System.out.println(almanac.finishProject("Alice", "ProjectC")); // Not found
        System.out.println(almanac.finishProject("Charlie", "ProjectY")); // Not found

        // Check after finishing
        System.out.println(almanac.currentProjects("Alice")); // [ProjectB]
    }
}
