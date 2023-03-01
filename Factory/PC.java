package Factory;

public class PC extends Computer {
    private String ram, cpu;
    public PC(String ram, String cpu)
    {
        this.cpu=cpu;
        this.ram=ram;
    }
    
    /** 
     * @return String Returns the RAM of PC
     */
    public String getRAM()
    {
        return this.ram;
    }
    public String getCPU()
    {
        return this.cpu;
    }

}
