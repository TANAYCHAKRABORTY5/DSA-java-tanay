package Trees.Questions;

import java.util.*;

public class WordLadder {
    public static int ladderLength(String beignWord,String endWord,List<String> wordList){
        if(!wordList.contains(endWord)){
            return 0;
        }

        Set<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();

        q.offer(beignWord);
        int length = 0;

        while(!q.isEmpty()){
            int size = q.size();
            length ++;

            for(int i = 0;i<size;i++){
                String curr = q.poll();

                for(int j=0;j<curr.length();j++){
                    char[] temp = curr.toCharArray();

                    for(char c = 'a' ; c<= 'z' ; c++){
                        temp[j] = c;
                        String newWord = new String(temp);

                        if(newWord.equals(endWord)){
                            return length+1;
                        }

                        if(wordList.contains(newWord) && !visited.contains(newWord)){
                            q.offer(newWord);
                            visited.add(newWord);
                        }
                    }
                }

            }

        }

        return 0;
    }

    public static void main(String[] args) {
        String beignWord = "hit";
        String endWord = "cog";

        List<String> wordList = Arrays.asList("hot","dot","dog","lot","log","cog");


        int length = ladderLength(beignWord,endWord,wordList);

        System.out.println("Length  is : " + length);
    }

}
