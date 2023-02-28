package Factory;

public class FactoryDemo {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc", "4 GB", "2.5 GHz");
        Computer server = ComputerFactory.getComputer("server", "16 GB", "3 GHz");
        System.out.println(pc);
        System.out.println(server);
    }
}
