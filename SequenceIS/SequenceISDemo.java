package SequenceIS;
import java.io.*;
import java.util.*;
public class SequenceISDemo {
    public static void main(String[] args) throws Exception {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("Concourse".getBytes());
        StringBufferInputStream stringBufferInputStream = new StringBufferInputStream("Information");
        SequenceInputStream sequenceInputStream = new SequenceInputStream(byteArrayInputStream, stringBufferInputStream);
        int ch;
        while((ch=sequenceInputStream())!=-1)
        {
            System.out.print((char)ch);
        }
    }
}
