package Question6;

class DerivedClass extends BaseClass
{
    DerivedClass()
    {
        try
        {
            //BaseClass base = new BaseClass();
        }
        catch(RuntimeException rte)
        {
            System.out.println("In catch block...");
            System.out.println(rte);
            //Not able to catch exception thrown by base class constructor
        }
    }
}