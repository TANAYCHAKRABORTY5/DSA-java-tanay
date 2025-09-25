package Capgemini_Practise_Questions.videosQuestions;

class StringPlay{
    int convert;
    int max;

    public StringPlay(){}
}

class StringMethods{
    public int convertToInt(StringPlay sp , String str){
        int var = Integer.parseInt(str);
        sp.convert = var;
        return var;
    }

    public int getMax(StringPlay sp,String str,char ch){
        int count =0;

        for(char c : str.toCharArray()){
            if( c == ch) count++;
        }
        sp.max = count;
        return count;
    }
}


public class Q4 {
    public static void main(String[] args) {
        StringMethods sm = new StringMethods();
        StringPlay sp = new StringPlay();
        int result = sm.getMax(sp,"fgfgfgf",'g');
        System.out.println(result);


        int result2 = sm.convertToInt(sp,"123");
        System.out.println(result2);
    }
}
