package FileOperations;
import java.io.*;
public class RenameFile {
    public static void main(String[] args) {
        File file = new File("Myfile.txt");
        File renamedFile = new File("RenamedFile.txt");
        boolean fileRenamed = file.renameTo(renamedFile);
        System.out.println(fileRenamed?"File is renamed":"Can't rename file");
    }
}
