package Capgemini_Practise_Questions.String;



//Q1 -> Given a string containing “#” characters, move all the hashes to the front of the string and return the modified string.
// Example: Move#Hash#to#Front → ###MoveHashtoFront

public class Q1 {

    public static String helper(String sc){
        StringBuilder result = new StringBuilder();

        for(char c : sc.toCharArray()){
            if(c == '#'){
                result.insert(0,c);
            }else{
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String sc = "Move#Hash#to#Front";

        String result = helper(sc);

        System.out.println(result);
    }
}
