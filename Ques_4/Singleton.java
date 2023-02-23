package Ques_4;

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
