package Question3;

/*
 * Try the code by replacing the return statement in the try block with System.exit(0)
 * Output - Program exits without printing anything
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
    

