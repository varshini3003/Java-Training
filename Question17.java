/*
 * 1. Trying to modify a constant variable
 * 2. Trying to access a static member in a non-static method
 * 3. Trying to create class with one argument and instantiating object without parameter
 */
class Test
{
    int arg;
    // Created a class with one argument
    Test(int arg)
    {
        this.arg=arg;
    }
}
public class Question17 {
    public void greet() 
    {
        //Able to access static member in a non-static method
        System.out.print(str);
    }
    static String str = "Hello";
    public static void main(String[] args)
    {
        final int a = 5;
        /*
         * Cannot modify or reassign a constant variable
         */
        //a=10;
        Question17 q = new Question17();
        q.greet();

        //Test t = new Test();
        //Cannot instantiate an object without parameter when the class has one argument
    }
}
