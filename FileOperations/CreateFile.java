package FileOperations;
import java.io.*;
public class CreateFile {
    public static void main(String[] args)
    {
        File file = new File("Myfile.txt");       
        try
        {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Writing contents to file...");
            fileWriter.close();
            System.out.println("Written to file");
        }
        catch(IOException exception)
        {

        }
    }
}
