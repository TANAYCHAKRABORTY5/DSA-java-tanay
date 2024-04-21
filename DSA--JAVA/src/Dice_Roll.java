import java.util.ArrayList;

public class Dice_Roll {
    public static void main(String[] args) {
        dice("",4);
        System.out.println(diccee("",4));
    }

    static void dice(String p ,int target){
        if(target==0){
            System.out.println(p);
            return;
        }

        for(int i=1;i<=6 && i<=target ; i++){
            dice(p+i,target-i);
        }
    }

    static ArrayList<String> diccee(String p,int target){
        if(target==0){
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }


        ArrayList<String> list =new ArrayList<>();
        for(int i=1;i<=6 && i<=target;i++){
            list.addAll(diccee(p+i,target-i));
        }

        return list;

    }
}
