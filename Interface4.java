interface IntFace1
{
    public void method1();
    public void method2();
}
interface IntFace2
{
    public void method3();
    public void method4();
}
interface IntFace3
{
    public void method5();
    public void method6();
}
interface wholeIntFace extends IntFace1, IntFace2, IntFace3
{

}
class ImplementingClass implements wholeIntFace
{
    public void method1()
    {
        System.out.println("In method 1...");
    }
    public void method2()
    {
        System.out.println("In method 2...");
    }
    public void method3()
    {
        System.out.println("In method 3...");
    }
    public void method4()
    {
        System.out.println("In method 4...");
    }
}
public class Interface4 {
    public static void main(String[] args) {
        ImplementingClass ic = new ImplementingClass();
        
    }
}   
