import java.io.IOException;

/*
 * Try the following and observe the result - Output is "caller"
 * Also try it with a statement throwing some exception in line 1 
 */
class Sample
{
    public void method1()
    {
        method2();
        System.out.println("caller");
    }
    public void method2()
    {
        try
        {
            throw new IOException();
            //return; - return removed as it is unreachable
        }
        catch(Exception e)
        {
            System.out.println("catch-method2");   //Exception caught 
        }
    }
}
public class ExcepHandle2 {
    public static void main(String[] args) {
    Sample s = new Sample();
    s.method1();
}
}

