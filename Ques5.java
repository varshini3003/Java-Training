/*
 * Calculating number of objects created at any point using user-defined class
 */
class Example
{
    char ch = 'a';
    static int noOfObjects = 0;
    {
        noOfObjects += 1;
    }
}
public class Ques5 {
    public static void main(String[] args)
    {
        Example e = new Example();
        Example e1 = new Example();
        System.out.print(Example.noOfObjects);
    }
}
