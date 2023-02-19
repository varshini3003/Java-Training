/*
 * Create an abstract class with no abstract methods
 */
abstract class AbstractDemo
{
    //This is a non-abstract method
    public void method()
    {
        System.out.println("Abstraction");
    }
    public int i=0;
}
public class Ques13 extends AbstractDemo{
    public static void main(String[] args)
    {
        //Can't create an abstract class object
        AbstractDemo ad = new Ques13();
        ad.method();
        System.out.println(ad.i);
    }
}
