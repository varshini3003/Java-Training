package Strategy;

public class Twitter implements SocialMediaStrategy{
    public void connectWith(String friend) 
    {
      System.out.println("Tweeting to " + friend + " through Twitter");
    }
}