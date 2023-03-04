package FileContents;
import java.io.*;
public class PrintFileContents {
    public static void main(String[] args) {
        String line = null;
        try
        {
            FileReader fileReader = new FileReader("RenamedFile.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while((line=bufferedReader.readLine())!=null)
            {
                System.out.println(line);
            }
            bufferedReader.close();
        }
        catch(IOException exception)
        {
            exception.printStackTrace();
        }
    }
}
