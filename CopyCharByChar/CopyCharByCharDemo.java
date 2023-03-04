package CopyCharByChar;
import java.io.*;
public class CopyCharByCharDemo {
    public static void main(String[] args) throws IOException{
        FileReader fileReader = new FileReader("RenamedFile.txt");
        FileWriter fileWriter = new FileWriter("Destination2.txt");
        int character;
        while((character=fileReader.read())!=-1)
        {
            fileWriter.write(character);
        }
        fileWriter.close();
        fileReader.close();
    }
}
