package Factory;

public abstract class Computer {
    public abstract String getRAM();
    public abstract String getCPU();
    public String toString()
    {
        return "RAM: "+this.getRAM()+" CPU: "+this.getCPU();
    }
}
