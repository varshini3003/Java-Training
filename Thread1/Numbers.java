package Thread1;

public class Numbers {
    synchronized public void displayEven() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name);
        for(int num=2; num<=100; num+=2)
        {
            System.out.print(num+" ");
        }
        System.out.println();
		try {Thread.sleep(2000);}catch(Exception e) {}
	}
	synchronized public void displayOdd() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name);
        for(int num=1; num<=100; num+=2)
        {
            System.out.print(num+" ");
        }
		try {Thread.sleep(1000);}catch(Exception e) {}
	}
}
