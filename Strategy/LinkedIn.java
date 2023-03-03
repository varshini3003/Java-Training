package Strategy;

public class LinkedIn implements SocialMediaStrategy{
    public void connectWith(String friend) 
    {
      System.out.println("Sent a connection request to " + friend + " through LinkedIn");
    }
}