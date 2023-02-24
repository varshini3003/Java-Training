package Question_7;

class Cuboid implements CalcVolume
{
    int length, breadth, height;
    Cuboid(int length, int breadth, int height)
    {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    public double calculate_volume()
    {
        return length*breadth*height;
    }
}