/*
 * Creating singleton class
 */
class Singleton 
{   
    private static Singleton singleton;     
    public char character = 'a'; 
    private Singleton()   
    {   
        System.out.println("Learning singleton class...");   
    }     
    //Global access to get the object of Singleton class
    public static Singleton getObject()   
    {   
        if(singleton==null)
        {
            singleton=new Singleton();
        }
        return singleton;   
    }   
}  
public class Ques8 {
    public static void main(String[] args)
    {
        Singleton singletonObj = Singleton.getObject(); 
        singletonObj.character+=5; 
        System.out.println(singletonObj.character); 
        Singleton singleton_obj = Singleton.getObject();  
        System.out.println(singleton_obj.character);
        System.out.println("Two references refer to the same object...");
    }
}
