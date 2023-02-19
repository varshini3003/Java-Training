/*
 * Trying to change the state of an object using final reference variable
 */
class FinalDemo
{
    int value = 10;  
    public void setValue(int x)  
    {  
        value = x;  
    }  
    public int getValue()  
    {  
        return value;  
    }  
}
public class Ques7 {
    public static void main(String[] args)
    {
        /*
         * A reference variable declared final can never be reassigned to refer to an different object. 
         * However, the data within the object can be changed. 
         * So, the object state can be changed but not the reference.
         */
        final FinalDemo fd = new FinalDemo();
        System.out.println(fd.value);
        fd.setValue(5);
        System.out.println(fd.value);
    }
}
