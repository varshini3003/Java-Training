package Question_7;

class Square implements CalcArea
{
    int a;
    Square(int a)
    {
        this.a = a;
    }
    public double calculate_area()
    {
        return a*a;
    }
}
