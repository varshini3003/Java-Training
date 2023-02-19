class A2 
{
    String s;
    A2(String s)
    {
        this.s = s;
        System.out.println("Super class..");
    }
}
class C2 extends A2
{
    C2(String str)
    {
        super(str);
    }
}
public class Ques11 {
    public static void main(String[] args)
    {
        C2 c2 = new C2("Hi");
    }
}
