/*
 * 1. Creating a class with protected data 
 * 2. Creating another class with a method that manipulates the protected data in the first class
 */
class ProtectedData
{
    protected int data = 45;
}
class Class2
{
    ProtectedData pd = new ProtectedData();
    void method()
    {
        System.out.print(pd.data);
    }
}
public class Question23 {
    public static void main(String[] args) {
        Class2 c = new Class2();
        c.method();
    }
}
