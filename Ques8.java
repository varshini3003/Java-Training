/*
 * Creating singleton class
 */
class Single 
{   
    private static Single s;     
    public char ch = 'a'; 
    private Single()   
    {   
        System.out.println("Learning singleton class...");   
    }     
    //Global access to get the object of Singleton class
    public static Single getObject()   
    {   
        if(s==null)
        {
            s=new Single();
        }
        return s;   
    }   
}  
public class Ques8 {
    public static void main(String[] args)
    {
        Single a = Single.getObject(); 
        a.ch+=5; 
        System.out.println(a.ch); 
        Single b = Single.getObject();  
        System.out.println(b.ch);
        System.out.println("a and b refer to the same object...");
    }
}
