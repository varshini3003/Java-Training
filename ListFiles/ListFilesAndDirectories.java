package ListFiles;
import java.io.*;
public class ListFilesAndDirectories {
    public static void printFiles(File[] files, int level)
    {
        for(File file:files)
        {
            for(int index=0; index<level; index++)
            {
                System.out.print("\t");
            }
            if(file.isDirectory())
            {
                System.out.println(file.getName());
                printFiles(file.listFiles(), level+1);
            }
            else if(file.isFile())
            {
                System.out.println(file.getName());
            }
        }
    }
    public static void main(String[] args) {
        File directory = new File("/Users/varshinisankar/Desktop/day1/");
        if(directory.exists() && directory.isDirectory())
        {
            File files[] = directory.listFiles();
            printFiles(files,0);
        }
    }
}
