package Strategy;

public class Facebook implements SocialMediaStrategy{
    public void connectWith(String friend) 
    {
      System.out.println("Adding friend " + friend + " through Facebook");
    }
}
