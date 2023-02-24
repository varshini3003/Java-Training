package Thread2;

public class Message {
    synchronized public void display(String str)
    {
        System.out.println("------"+str+"------");
        try
        {
            Thread.sleep(2000);
        }
        catch(Exception e) {}
    }
}
