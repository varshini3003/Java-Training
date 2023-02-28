package Factory;

public class Server extends Computer{
    private String ram, cpu;
    public Server(String ram, String cpu)
    {
        this.cpu=cpu;
        this.ram=ram;
    }
    public String getRAM()
    {
        return this.ram;
    }
    public String getCPU()
    {
        return this.cpu;
    }
}
