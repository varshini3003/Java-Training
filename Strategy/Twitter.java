package Strategy;

public class Twitter implements SocialMediaStrategy{
    
    /** 
     * @param friend Describes the friend
     */
    public void connectWith(String friend) 
    {
      System.out.println("Tweeting to " + friend + " through Twitter");
    }
}