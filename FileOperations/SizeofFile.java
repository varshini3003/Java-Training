package FileOperations;

import java.io.*;
public class SizeofFile {
    public static void main(String[] args)
    {
        File file = new File("/Users/varshinisankar/Desktop/Java-Training/WordsInString/CountWords.java");
        long bytes = file.length();
        long megabytes = bytes/1024;
        long gigabytes = megabytes/1024;
        System.out.println("Size of file in bytes: "+bytes);
        System.out.println("Size of file in megabytes: "+megabytes);
        System.out.println("Size of file in gigabytes: "+gigabytes);
    }
}
