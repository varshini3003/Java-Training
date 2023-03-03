package Factory;

public class FactoryDemo {
    public static void main(String[] args) {
        try
        {
            Computer pc = ComputerFactory.getComputer("pc", "4 GB", "2.5 GHz");
            System.out.println(pc);
            Computer server = ComputerFactory.getComputer("", "16 GB", "3 GHz");
            System.out.println(server);
        }
        catch(NullPointerException ne)
        {
            System.out.println(ne);   
        }
       
    }
}
