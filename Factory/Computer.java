package Factory;

public abstract class Computer {
    public abstract String getRAM();
    public abstract String getCPU();
    
    /** 
     * @return String Returns the RAM and CPU type of the current computer object
     */
    public String toString()
    {
        return "RAM: "+this.getRAM()+" CPU: "+this.getCPU();
    }
}
