package Strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        SocialMedia socialMedia = new SocialMedia();
        socialMedia.setSocialmedia(new Facebook());
        socialMedia.connect("Varshini");
        socialMedia.setSocialmedia(new Twitter());
        socialMedia.connect("Varshini");
        socialMedia.setSocialmedia(new Instagram());
        socialMedia.connect("Varshini");
        socialMedia.setSocialmedia(new LinkedIn());
        socialMedia.connect("Varshini");
      }
}
