package Strategy;

public class SocialMedia {
    SocialMediaStrategy smStrategy;
    public void setSocialmedia(SocialMediaStrategy smStrategy) 
    {
        this.smStrategy = smStrategy;
    } 
    public void connect(String name) 
    {
        smStrategy.connectWith(name);
    }
}
