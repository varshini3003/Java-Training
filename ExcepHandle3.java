/*
 * Try the code by replacing the return statement in the try block with System.exit(0)
 * Output is - "catch-method2 finally-method2 caller"
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
            //return; 
            System.exit(0);
        }
        catch(Exception e)
        {
            System.out.println("catch-method2");  
        }
        finally
        {
            System.out.println("finally-method2");
        }
    }
}
public class ExcepHandle3 {
    public static void main(String[] args) {
    Sample sample = new Sample();
    sample.method1();
}
}

