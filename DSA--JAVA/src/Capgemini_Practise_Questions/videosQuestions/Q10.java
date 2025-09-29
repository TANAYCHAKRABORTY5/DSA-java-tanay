package Capgemini_Practise_Questions.videosQuestions;


import java.util.ArrayList;
import java.util.List;

class Person{
    private String name;
    private int age;

    Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class StreamImplementations{
    public int sumAge(List<Person> list){
        int sum =0;
        for(Person p : list){
            if(p.getAge() > 50){
                sum += p.getAge();
            }
        }
        return sum;
    }

    public List<String> printName(List<Person> list){
        List<String> names = new ArrayList<>();
        for(Person p : list){
            names.add(p.getName());
        }
        return names;
    }

    public List<Integer> printAge(List<Person> list){
        List<Integer> ages = new ArrayList<>();
        for(Person p : list){
            ages.add(p.getAge());
        }
        return ages;
    }
}

public class Q10 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 60));
        people.add(new Person("Bob", 45));
        people.add(new Person("Charlie", 70));
        people.add(new Person("David", 30));

        StreamImplementations imp = new StreamImplementations();

        System.out.println("Sum of age : "+ imp.sumAge(people));

        System.out.println("Names: "+ imp.printName(people));
        System.out.println("Age: "+ imp.printAge(people));
    }
}
