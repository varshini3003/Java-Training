package Strategy;

public class Instagram implements SocialMediaStrategy{
    public void connectWith(String friend) 
    {
      System.out.println("Following " + friend + " through Instagram");
    }
}