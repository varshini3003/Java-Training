/*
 * Create two classes A, B with default constructors.
 * Inherit a new class called C from A and create a member B inside C. Don't create a constructor for C
 * Create an object for class C
 */
class A1 
{
    int a;
    A1()
    {
        a = 10;
    }
}
class B1
{
    int b;
    B1()
    {
        b = 5;
    }
}
class C1 extends A1
{
    B1 bobject = new B1();
    void print()
    {
        System.out.println(bobject.b);
    }
}
public class Ques10 
{
    public static void main(String[] args)
    {
        C1 c = new C1();
        c.print();
    }
}
