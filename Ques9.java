/*
 * Create a class A and add public, private and protected data members and methods.
 * Create another class B which extends from A and few members.
 * Try to access a private, protected and public members of a base class within class B
 */
class A
{
    public int pub = 10;
    private int pri = 4;
    protected int pro = 5;
    public static void sayHi()
    {
        System.out.println("Hi");
    }
    private static void sayHello()
    {
        System.out.println("Hello");
    }
    protected static void say()
    {
        System.out.println("This is protected... Only my child can have access");
    }
}
class B extends A
{
    public void display()
    {
        sayHi();
        //sayHello();
        //Can't access private method and private data member
        System.out.println(pub+pro);
        say();
    }
}
public class Ques9 {
    public static void main(String[] args)
    {
        B b = new B();
        b.display();
    }
    
}
