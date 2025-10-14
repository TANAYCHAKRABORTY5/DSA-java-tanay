package Capgemini_Practise_Questions.videosQuestions;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

class Student{
    String studentName;
    Integer studentId;
    int studentScore;
    String scholarshipScheme;

    public Student(String studentName,Integer studentId,int studentScore,String scholarshipScheme){
        this.studentName =studentName;
        this.studentId =studentId;
        this.studentScore =studentScore;
        this.scholarshipScheme = scholarshipScheme;
    }
    public String toString(){
        return studentId+ " "+studentName+ " "+studentScore+ " "+scholarshipScheme;
    }
}

class ScholarShipImpl{
    static HashMap<Integer,Student> hm = new HashMap<>();
    public void addStudent(Student std){
        hm.put(std.studentId,std);
    }

    public ArrayList<Student> getStudentDetails(String scholarShipScheme){
        ArrayList<Student> list = new ArrayList<>();
        for (Student s : hm.values()){
            if(s.scholarshipScheme.equalsIgnoreCase(scholarShipScheme)){
                list.add(s);
            }
        }
        return list;
    }

    public boolean deleteStudent(int id){
       if(hm.containsKey(id)){
           hm.remove(id);
           return true;
       }
       return false;
    }
}

public class Q14 {
    public static void main(String[] args) {
        ScholarShipImpl impl = new ScholarShipImpl();

        // Pre-populated Students (for testing)
        impl.addStudent(new Student("Tanay", 101, 96, "Scheme A"));
        impl.addStudent(new Student("Ravi", 102, 92, "Scheme B"));
        impl.addStudent(new Student("Priya", 103, 85, "No Scheme"));
        impl.addStudent(new Student("Ankit", 104, 99, "Scheme A"));
        impl.addStudent(new Student("Sneha", 105, 91, "Scheme B"));

        // Example usage
        System.out.println("🎓 Students with Scheme A:");
        for (Student s : impl.getStudentDetails("Scheme A")) {
            System.out.println(s);
        }

        System.out.println("\nDeleting Student with ID 103:");
        System.out.println(impl.deleteStudent(103)); // true

        System.out.println("\n🎓 Students with Scheme B:");
        for (Student s : impl.getStudentDetails("Scheme B")) {
            System.out.println(s);
        }
    }
}
