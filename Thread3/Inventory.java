package Thread3;

public class Inventory {
    boolean flag = false;
    int countOfproducts=0;
    synchronized public void produce()
    {
        Thread t = Thread.currentThread();
		String name=t.getName();
		if(flag)
		{
			try
			{
				wait();
			}
			catch(Exception e) {}
		}
		System.out.println("Producing by "+name);
        countOfproducts++;
        System.out.println("Number of products in the inventory: "+countOfproducts);
		flag=true;
		notify();
    }
    synchronized public void consume()
    {
        Thread t = Thread.currentThread();
		String name=t.getName();
		if(!flag)
		{
			try
			{
				wait();
			}
			catch(Exception e) {}
		}
		System.out.println("Consuming by "+name);
        countOfproducts--;
        System.out.println("Number of products in the inventory: "+countOfproducts);
		flag=false;
		notify();
    }
}
