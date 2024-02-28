import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        fun(2,5,7,7,8,9,64,33,33,24,4);
    }

    static void fun (int ...v){
        System.out.println(Arrays.toString(v));
    }
} 