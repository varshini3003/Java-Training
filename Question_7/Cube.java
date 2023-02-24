package Question_7;

class Cube implements CalcVolume
{
    int a;
    Cube(int a)
    {
        this.a=a;
    }
    public double calculate_volume()
    {
        return a*a*a;
    }
}