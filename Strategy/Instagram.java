package Strategy;

public class Instagram implements SocialMediaStrategy{
    
    /** 
     * @param friend Describes the friend
     */
    public void connectWith(String friend) 
    {
      System.out.println("Following " + friend + " through Instagram");
    }
}