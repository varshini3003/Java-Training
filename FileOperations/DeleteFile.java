package FileOperations;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
public class DeleteFile {
    public static void main(String[] args)
    {
        try
        {
            boolean fileFound = Files.deleteIfExists(Paths.get("Renamedfile.txt"));
            System.out.println(fileFound?"Deleted file":"Couldn't delete file");
        }
        catch(IOException exception)
        {
           
        }
    }
    
}
