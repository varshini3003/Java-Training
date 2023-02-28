package Factory;

public class ComputerFactory {
    public static Computer getComputer(String type, String ram, String cpu)
    {
        if(type.equalsIgnoreCase("PC"))
        {
            return new PC(ram, cpu);
        }
        else if(type.equalsIgnoreCase("Server"))
        {
            return new Server(ram, cpu);
        }
        return null;
    }
}
