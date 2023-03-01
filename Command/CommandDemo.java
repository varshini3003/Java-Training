package Command;

public class CommandDemo {
    public static void main(String[] args)    {
        Remote control = new Remote();
        Light light = new Light();
        Command lightsOn = new LightOnCommand(light);
        Command lightsOff = new LightOffCommand(light);
        control.setCommand(lightsOn);
        control.pressButton();
        control.setCommand(lightsOff);
        control.pressButton();
      }
}
