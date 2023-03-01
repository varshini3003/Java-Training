package Factory;

public class ComputerFactory {
    
    /** 
     * @param type A string that specifies the type of the computer
     * @param ram A string that specifies the RAM of the computer
     * @param cpu A string that specifies the CPU of the computer
     * @return Computer Returns a new PC of the specified RAM and CPU if the type is mentioned as "PC" else returns a new server of the specified RAM and CPU if the type is mentioned as "Server" else returns null object
     */
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
