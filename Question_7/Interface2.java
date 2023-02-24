package Question_7;

public class Interface2 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(4,5);
        Triangle t = new Triangle(5,10);
        Cylinder c = new Cylinder(7,14);
        Cube cu = new Cube(6);
        System.out.println("Area of rectangle: "+r.calculate_area());
        System.out.println("Area of triangle: "+t.calculate_area());
        System.out.println("Volume of Cylinder: "+ c.calculate_volume());
        System.out.print("Volume of cube: "+cu.calculate_volume());
    }
}