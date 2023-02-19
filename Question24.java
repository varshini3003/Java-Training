/*
 * Class Quadratic with 
 * i) constructor of no parameter with a, b, c initialized to 1
 * ii) constructor of 3 parameters setting a, b, c
 * iii) three extractors returning a, b, c
 * iv) modifiers having one parameter each to give value to a, b, c
 * v) compute method to calculate f(x) = ax^2 + bx + c
 */
class Quadratic
{
    public double a, b, c;
    Quadratic()
    {
        a=1;
        b=1;
        c=1;
    }
    Quadratic(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA()
    {
        return a;
    }
    public double getB()
    {
        return b;
    }
    public double getC()
    {
        return c;
    }
    public void setA(double a)
    {
        this.a = a;
    }
    public void setB(double b)
    {
        this.b = b;
    }
    public void setC(double c)
    {
        this.c = c;
    }
    public double compute(double x)
    {
        double fx = a*x*x + b*x + c;
        return fx;
    }
}
public class Question24 {
    public static void main(String[] args)
    {
        Quadratic q = new Quadratic();
        System.out.println("Values of a: "+q.a+", b: "+q.b+", c: "+q.c);
        double x = 2.0;
        System.out.println("f(x): "+q.compute(x));
        Quadratic q1 = new Quadratic(2, 2, 2);
        System.out.println("Values of a: "+q1.getA()+", b: "+q1.getB()+", c: "+q1.getC());
        System.out.println("f(x): "+q1.compute(x));
        Quadratic q2 = new Quadratic();
        q2.setA(0);
        q2.setB(1);
        q2.setC(2);
        System.out.println("Values of a: "+q2.getA()+", b: "+q2.getB()+", c: "+q2.getC());
        System.out.println("f(x): "+q2.compute(x));
    }  
}
