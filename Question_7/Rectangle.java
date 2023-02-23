package Question_7;

class Rectangle implements CalcArea
{
    int length, breadth;
    Rectangle(int length, int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    public double calculate_area()
    {
        return length*breadth;
    }
}
