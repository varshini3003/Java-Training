package Thread8;

public class MyThread extends Thread{
    StringBuffer stringBuffer;
    MyThread(StringBuffer stringBuffer)
    {
        this.stringBuffer = stringBuffer;
    }
    public void run()
    {
        synchronized(stringBuffer)
        {
            for(int num=1; num<=100; num++)
            {
                System.out.print(stringBuffer+" ");
            }
            System.out.println();
            try{
                Thread.sleep(1500);
            }
            catch(Exception e) {}
            char next_character = (char)(stringBuffer.charAt(0)+1);
            stringBuffer.setCharAt(0, next_character);
        }
    }
}
