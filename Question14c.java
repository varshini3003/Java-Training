/*
 * Trying to execute java program by defining main  
 * i) Without public modifier
 * ii) Without static modifier
 * iii) Without function paramaeter i.e. String args
 */
public class Question14c {
    public static void main(String[] args)
    {
        System.out.println("Without public, static and Sring args, we cannot execute java program as JVM could not find the main method.");
        System.out.println("It is made public so that the main method is globally available.");
        System.out.println("The main method is static so that JVM can invoke it without instantiating the class.");
        System.out.print("String args allows the method to accept zero or multiple arguments");
    }
}
