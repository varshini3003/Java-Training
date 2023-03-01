package Strategy;

public class SocialMedia {
    SocialMediaStrategy smStrategy;
    
    /** 
     * @param smStrategy An object of the SocialMediaStrategy object
     */
    public void setSocialmedia(SocialMediaStrategy smStrategy) 
    {
        this.smStrategy = smStrategy;
    } 
    public void connect(String name) 
    {
        smStrategy.connectWith(name);
    }
}
