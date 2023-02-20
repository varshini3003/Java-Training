interface CalcArea
{
    public double calculate_area(double a);
    public double calculate_area(double lenorbase, double breorheight);

}
interface CalcVolume
{
    public double calculate_volume(double a);
    public double calculate_volume(double r, double h);
    public double calculate_volume(double len, double bre, double height);
}
class Rectangle implements CalcArea
{
    public double calculate_area(double lenorbase, double breorheight)
    {
        return lenorbase*breorheight;
    }
}
class Triangle implements CalcArea
{
    public double calculate_area(double lenorbase, double breorheight)
    {
        return 0.5*breorheight*lenorbase;
    }
}
class Square implements CalcArea
{
    public double calculate_area(double a)
    {
        return a*a;
    }
}
class Circle implements CalcArea
{
    public double calculate_area(double a)
    {
        return 3.14*a*a;
    }
}
class Cube implements CalcVolume
{
    public double calculate_volume(double a)
    {
        return a*a*a;
    }
}
class Cuboid implements CalcVolume
{
    public double calculate_volume(double len, double bre, double height)
    {
        return len*bre*height;
    }
}
class Cylinder implements CalcVolume
{
    public double calculate_volume(double r, double h)
    {
        return 3.14*r*r*h;
    }
}
public class Interface2 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        Cylinder c = new Cylinder();
        Cube cu = new Cube();
        System.out.println("Area of rectangle: "+r.calculate_area(4,5));
        System.out.println("Area of triangle: "+t.calculate_area(5,10));
        System.out.println("Volume of Cylinder: "+ c.calculate_volume(7, 14));
        System.out.print("Volume of cube: "+cu.calculate_volume(6));
    }
}
