/*
 * 1. Creating a class with public, private, default and protected members and attributes
 * 2. Trying to access all these class members from outside the class
 */
//Cannot have two public classes in a single java file
/*public class PublicClass
{
    public int pub=10;
    public void greet()
    {
        System.out.println("Hello");
    }
}*/
/*private class PrivateClass
{
    private int pri=100;
    private void welcome()
    {
        System.out.println("Welcome");
    }
}*/
/*
 * Illegal modifier for the Protected Class; only public, abstract & final are permitted
 */
/* protected class ProtectedClass
{
    protected int pro=20;
    protected void hi()
    {
        System.out.println("Hi");
    }
}*/
class DefaultClass
{
    int def=50;
    void packagepriv()
    {
        System.out.println("This is the default class");
    }
}
public class Question22 {
    public static void main(String[] args) 
    {
        //Cannot access private data from other class
        //PrivateClass pc = new PrivateClass();
        //ProtectedClass prc = new ProtectedClass();
        DefaultClass dc = new DefaultClass();
        dc.packagepriv();
    }
}
