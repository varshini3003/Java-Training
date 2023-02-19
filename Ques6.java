/*
 * Proving the order of initialization in static block
 */
class StaticExample
{
    static int k = 1;
    static 
    {
        k = 2;
    }
    static
    {
        k=3;
    }
}
public class Ques6 {
    public static void main(String[] args)
    {
        StaticExample se = new StaticExample();
        System.out.print(se.k);
        /*
         * If there are two or more static blocks then they are executed in the order in which they appear in the source code.
         */
    }
}
