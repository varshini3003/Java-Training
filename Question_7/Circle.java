package Question_7;

class Circle implements CalcArea
{
    int radius;
    Circle(int radius)
    {
        this.radius = radius;
    }
    public double calculate_area()
    {
        return 3.14*radius*radius;
    }
}