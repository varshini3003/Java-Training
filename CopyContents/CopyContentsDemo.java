package CopyContents;
import java.io.*;
public class CopyContentsDemo {
    public static void main(String[] args) throws Exception{
        File source = new File("RenamedFile.txt");
        File destination = new File("Destination.txt");
        FileInputStream fileInputStream = new FileInputStream(source);
        FileOutputStream fileOutputStream = new FileOutputStream(destination);
        try
        {
            int line;
            while((line=fileInputStream.read())!=-1)
            {
                fileOutputStream.write(line);
            }
        }
        finally
        {
            if(fileInputStream!=null)
            {
                fileInputStream.close();
            }
            if(fileOutputStream!=null)
            {
                fileOutputStream.close();
            }
        }
        System.out.println("File copied");
    }
}
