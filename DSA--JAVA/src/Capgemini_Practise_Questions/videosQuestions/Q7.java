package Capgemini_Practise_Questions.videosQuestions;


import java.util.ArrayList;
import java.util.List;

class Dish{
    String dishName;

    public Dish(String dishName){
        this.dishName = dishName;
    }

    public String getDishName(){
        return dishName;
    }
    public void setDishName(String dishName){
        this.dishName =dishName;
    }

    public String toString(){
        return dishName;
    }


}

class DishTest{
    public List<Dish> addYummyToName(List<Dish> list,String s){
        List<Dish> updatedList = new ArrayList<>();
        for(Dish d : list){
            updatedList.add(new Dish("Yummy"+d.getDishName()));
        }
        return updatedList;
    }

    public Long count(List<Dish> list,String s){
        long count =0;
        for (Dish d : list){
            if(d.getDishName().contains(s)){
                count++;
            }
        }
        return count;
    }
}


public class Q7 {
    public static void main(String[] args) {
        List<Dish> dishes = new ArrayList<>();
        dishes.add(new Dish("Pizza"));
        dishes.add(new Dish("Burger"));
        dishes.add(new Dish("Pasta"));

        DishTest dt = new DishTest();

        // Adding "Yummy" to names
        List<Dish> yummyList = dt.addYummyToName(dishes, "Yummy");
        System.out.println("Updated List: " + yummyList);

        // Counting dishes containing a substring
        Long count = dt.count(dishes, "a"); // "Pizza" and "Pasta" contain "a"
        System.out.println("Count of dishes containing 'a': " + count);
    }
}
