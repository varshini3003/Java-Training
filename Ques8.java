/*
 * Creating singleton class
 */
class Single 
{   
    private static Single s = null;   
    public String str;   
    private Single()   
    {   
        str = "Learning singleton class.";   
    }     
    public static Single getObject()   
    {   
        if (s== null)   
        {
            s = new Single();   
        }
        return s;   
    }   
}  
public class Ques8 {
    public static void main(String[] args)
    {
        Single a = Single.getObject();   
        Single b = Single.getObject();   
        System.out.println(a.str);
        System.out.println(b.str);
    }
}
