public class recursion_skipAcharacter {

    public static void main(String[] args) {
        skip("","baccdahaa");
        System.out.println(skipApple("myappleisred"));
        System.out.println(skipAppNotApple("myappleisred"));
    }

    static void skip(String p ,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch =up.charAt(0);

        if(ch=='a'){
            skip(p,up.substring(1));
        }else{
            skip(p+ch,up.substring(1));
        }
    }

    //skipping a word
    static String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }

        if (up.startsWith("apple")){
            return skipApple(up.substring(5));
        }else{
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }

    //skipping app if it is not apple
    static String skipAppNotApple(String up){
        if(up.isEmpty()){
            return "";
        }

        if (up.startsWith("app") && !up.startsWith("apple")){
            return skipAppNotApple(up.substring(3));
        }else{
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }


}
