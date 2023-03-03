package Thread2;

public class Message {
    
    /** 
     * @param str String read from the user to display it in the given format
     */
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
