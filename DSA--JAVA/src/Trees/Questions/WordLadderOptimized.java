package Trees.Questions;

import java.util.*;

public class WordLadderOptimized {


    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord)){
            return 0;
        }

        Set<String> wordSet = new HashSet<>(wordList);
        Set<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();

        q.offer(beginWord);
        visited.add(beginWord);
        int length = 1;

        while(!q.isEmpty()){
            int size = q.size();


            for(int i = 0;i<size;i++){
                String curr = q.poll();

                char[] temp = curr.toCharArray();
                for(int j=0;j<temp.length;j++){
                    char originalchar = temp[j];

                    for(char c = 'a' ; c<= 'z' ; c++){
                        temp[j] = c;
                        String newWord = new String(temp);

                        if(newWord.equals(endWord)){
                            return length+1;
                        }

                        if(wordSet.contains(newWord) && !visited.contains(newWord)){
                            q.offer(newWord);
                            visited.add(newWord);
                        }
                    }
                    temp[j] = originalchar;
                }

            }
            length++;

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
