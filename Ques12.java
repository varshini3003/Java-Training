class Wipro
{
    public void fire()
    {
        System.out.println("Firing Wipro employees...");
    }
}
class WiproTechnologies extends Wipro
{
    public void fire()
    {
        System.out.println("Firing employees in WiproTechnologies...");
    }
}
class WiproInfoTech extends Wipro
{
    public void fire()
    {
        System.out.println("Firing employees in WiproInfoTech...");
    }
}
class WiproBPO extends Wipro
{
    public void fire()
    {
        System.out.println("Firing employees in WiproBPO...");
    }
}
public class Ques12 {
    public static void main(String[] args)
    {
        Wipro[] w = new Wipro[3];
        w[0] = new WiproTechnologies();
        w[1] = new WiproInfoTech();
        w[2] = new WiproBPO();
        w[0].fire();
        w[1].fire();
        w[2].fire();
    }
}
