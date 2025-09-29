package Hashmaps.KarpRabin;

public class KarpRabin {
    private final int Prime = 101;

    private double calculateHash(String str){
        double hash =0;

        for(int i= 0; i<str.length();i++){
            hash+= str.charAt(i) * Math.pow(Prime,i);
        }

        return hash;
    }

    private  double updatedHAsh(double prevhash,char oldchar,char newchar,int patternlenght){
        double newhash = (prevhash - oldchar) / Prime;
        newhash  = newhash + newchar * Math.pow(Prime,patternlenght-1);
        return newhash;
    }

    public  void search(String text ,String pattern){
        int patternLength  = pattern.length();

        double patternHash =calculateHash(pattern);

        double textHash = calculateHash(text.substring(0,patternLength));

        for (int i = 0; i<= text.length() - patternLength;i++){
            if(textHash == patternHash){
                if(text.substring(i,i+patternLength).equals(pattern)){
                    System.out.println("Pattern found at index " + i);
                }
            }

            if(i<text.length()-patternLength){
                textHash  = updatedHAsh(textHash,text.charAt(i),text.charAt(i+patternLength),patternLength);
            }
        }
    }
}
