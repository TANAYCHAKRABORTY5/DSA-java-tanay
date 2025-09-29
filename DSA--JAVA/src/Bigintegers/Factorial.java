package Bigintegers;

import java.math.BigInteger;

public class Factorial {
    static BigInteger fact(int num){
        BigInteger ans = new BigInteger("1");

        for(int i=2;i<=num;i++){
            ans = ans.multiply(BigInteger.valueOf(i));
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Factorial.fact(2313));
    }
}
