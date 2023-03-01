package Strategy;

public class Facebook implements SocialMediaStrategy{
    
    /** 
     * @param friend Describes the friend
     */
    public void connectWith(String friend) 
    {
      System.out.println("Adding friend " + friend + " through Facebook");
    }
}
