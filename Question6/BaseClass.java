package Question6;

/*
 * Program to check whether a derived class constructor can catch exception
 * thrown by base class constructor
 */
class BaseClass
{
    BaseClass()
    {
        System.out.println("In base class constructor... Going to throw an exception...");
        throw new RuntimeException("Throwing a Runtime exception");
    }
}