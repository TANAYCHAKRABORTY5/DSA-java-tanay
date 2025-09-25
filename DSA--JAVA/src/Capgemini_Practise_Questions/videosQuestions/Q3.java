package Capgemini_Practise_Questions.videosQuestions;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Model{
    private String modelName;
    private int carSpeed;

    public Model(String modelName,int carSpeed){
        this.modelName = modelName;
        this.carSpeed = carSpeed;
    }

    public String getModelName(){
        return modelName;
    }

    public void setModelName(String modelName){
        this.modelName = modelName;
    }

    public int getCarSpeed(){
        return carSpeed;
    }

    public void setCarSpeed(int carSpeed){
        this.carSpeed = carSpeed;
    }

    public String toString(){
        return "Model[model='"+ modelName + "', speed="+carSpeed+"]";
    }

}

class Implementation{
    public List<String> getModelName(List<Model> list){
        return list.stream().map(Model:: getModelName).collect(Collectors.toList());
    }
    public Model getModelInfo(List<Model> list,String model,int speed){
        return list.stream().filter(m -> m.getModelName().equals(model) && m.getCarSpeed() == speed).findFirst().orElse(null);
    }
}


public class Q3 {
    public static void main(String[] args) {
        List<Model> list = new ArrayList<>();
        list.add(new Model("SUV",500));
        list.add(new Model("SEDAN",800));

        Implementation impl = new Implementation();

        System.out.println(impl.getModelName(list));

        System.out.println(impl.getModelInfo(list,"SUV",500));
        System.out.println(impl.getModelInfo(list,"HATCHBACK",400));

    }
}
