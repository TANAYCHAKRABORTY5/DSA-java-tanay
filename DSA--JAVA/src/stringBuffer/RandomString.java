package stringBuffer;

import java.util.Random;

public class RandomString {

    static String generate(int size){
        StringBuffer sb = new StringBuffer(size);

        Random random = new Random();


        for(int i=0;i<size;i++){
            int randomchar= 97 + (int)(random.nextFloat() * 26);
            sb.append((char)randomchar);
        }
        return sb.toString();
    }
}
