package Question_7;

class Cylinder implements CalcVolume
{
    int radius, height;
    Cylinder(int radius, int height)
    {
        this.radius = radius;
        this.height = height;
    }
    public double calculate_volume()
    {
        return 3.14*radius*radius*height;
    }
}