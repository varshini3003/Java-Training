package Thread8;
/*
 * Create a class and extend the Thread class. Override the run() method of Thread.
 * This is where the synchronized block of code will go. For our three thread objects to 
 * share the same object, we will need to create a constructor that accepts a StringBuffer object 
 * in the argument. The synchronized block of code will obtain a lock on the StringBuffer object 
 * within the block, output the StringBuffer 100 times and then increment the letter in the StringBuffer. 
 * Finally, in the main method, create a single StringBuffer object using the letter A, then create three
 * instances of our class and start all three of them.
 */
public class ThreadDemo8 {
    public static void main(String[] args)
    {
        StringBuffer stringBuffer = new StringBuffer("A");
        MyThread t1 = new MyThread(stringBuffer);
        MyThread t2 = new MyThread(stringBuffer);
        MyThread t3 = new MyThread(stringBuffer);
        t1.start();
        t2.start();
        t3.start();
    }
}
