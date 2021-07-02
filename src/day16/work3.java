package day16;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class work3 {
    public static void main(String[] args) throws IOException {
        String[] words = {"verb:eat","verb:drink","verb:sleep","verb:play","noun:rice","noun:meat","noun:hand","noun:hair"};
        File file1 = new File("verb.txt");
        File file2 = new File("noun.txt");
        file1.createNewFile();
        file2.createNewFile();
        FileOutputStream verbOutputStream = new FileOutputStream(file1,true);
        FileOutputStream nounOutputStream = new FileOutputStream(file2,true);
        for (String element:words){
           if( element.startsWith("verb")){
                verbOutputStream.write(element.getBytes());
                verbOutputStream.write(System.lineSeparator().getBytes());

           }else{
               nounOutputStream.write(element.getBytes());
               nounOutputStream.write(System.lineSeparator().getBytes());
           }
        }
        verbOutputStream.close();
        nounOutputStream.close();
    }
}
