package Capgemini_Practise_Questions.String;


//Q2.txt -> Compress repeated characters. Given a string like aabbbbeeeeffggg, output a2b4e4f2g3



public class Q2 {

    public static String helper(String sc){

        if(sc == null || sc.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();

        char a = sc.charAt(0) ;
        int count =1;
        for(int i =1;i<sc.length();i++){
            char c = sc.charAt(i);
            if(a == c){
                count++;
            }else{
                sb.append(a).append(count);
                a = c;
                count =1;
            }
        }
        sb.append(a).append(count);
        return sb.toString();
    }

    public static void main(String[] args) {
        String sc = "aabbbbeeeeffggg";
        String result = helper(sc);
        System.out.println(result);
    }
}
