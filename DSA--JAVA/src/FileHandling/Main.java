package FileHandling;

import java.io.*;

public class Main {
    public static void main(String[] args) {
//        try(InputStreamReader isr = new InputStreamReader(System.in)){
//            System.out.println("Enter some letters: " );
//            int letters = isr.read();
//            while (isr.ready()){
//                System.out.println((char) letters);
//                letters = isr.read();
//            }
//            isr.close();
//            System.out.println();
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }


        try (FileReader fr = new FileReader("src/FileHandling/note.txt")) {
//            System.out.println("Enter some letters: ");
            int letters = fr.read();
            while (fr.ready()) {
                System.out.println((char) letters);
                letters = fr.read();
            }
//            fr.close();
            System.out.println();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        // writing to other files
        try{
            FileWriter fw = new FileWriter("src/FileHandling/new-file.txt");
            fw.write("गुरुर ब्रह्मा गुरुर विष्णु गुरुर देवो महेश्वरः।\n" +
                    "गुरुः साक्षात्परब्रह्मा तस्मै श्री गुरुवे नमः।।");
            fw.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        // to create a new file

        try{
            File fo = new File("src/FileHandling/random.txt");
            fo.createNewFile();

            //for deleting
            if(fo.delete()){
                System.out.println(fo.getName());
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}