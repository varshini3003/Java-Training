package Ques_4;

/*
 * Creating singleton class
 */
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
