package Question_7;

class Triangle implements CalcArea
{
    int height, base;
    Triangle(int height, int base)
    {
        this.height = height;
        this.base = base;
    }
    public double calculate_area()
    {
        return 0.5*height*base;
    }
}
