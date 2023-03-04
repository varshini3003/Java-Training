package BufferedIS;
import java.io.*;

public class BufferedISDemo {
    public static void main(String[] args) throws IOException {
        String string = "99% is &approx; equal to 100 but this is &approx not.";
        byte buffer[] = string.getBytes();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(buffer);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(byteArrayInputStream);
        int c;
        char character=247;
        boolean marked=false;
        while((c=bufferedInputStream.read())!=-1)
        {
            switch(character)
            {
                case '&':
                    if(marked)
                    {
                        bufferedInputStream.mark(32);
                        marked=true;
                    }
                    else
                    {
                        marked=false;
                    }
                    break;
                case ';':
                    if(marked)
                    {
                        marked=false;
                        System.out.print(character);
                    }
                    else
                    {
                        System.out.print((char)c);
                    }
                    break;
                case ' ':
                    if(marked)
                    {
                        marked=false;
                        bufferedInputStream.reset();
                        System.out.print("&");
                    }
                    else
                    {
                        System.out.print((char)c);
                    }
                    break;
                default:
                    if(!marked)
                    {
                        System.out.print((char)c);
                    }
                    break;
            }
        }
        
    }
}
