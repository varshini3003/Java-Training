/*
 * Checking output for the following program
 */
//Illegal modifier for the class Base; only public, abstract & final are permitted
protected class Base
{
    String method()
    {
        return "Wow";
    }
}
public class Question25 
{
    public static void main(String[] args) {
         Base b = new Base();
         System.out.print(b.method());
    }
}
