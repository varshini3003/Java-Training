package FlyWeight;

public class FlyWeightDemo {
    public static void main(String[] args) {
        Brush blueThinBrush1 = BrushFactory.getThinBrush("BLUE"); 
        blueThinBrush1.draw("Hello There !!");
        Brush blueThinBrush2 = BrushFactory.getThinBrush("BLUE"); 
        blueThinBrush2.draw("Hello There Again!!");
        System.out.println("Hashcode: " + blueThinBrush1.hashCode());
        System.out.println("Hashcode: " + blueThinBrush2.hashCode());
        Brush yellowThinBrush1 = BrushFactory.getMediumBrush("YELLOW"); 
        yellowThinBrush1.draw("Hello There !!");
        Brush yellowThinBrush2 = BrushFactory.getMediumBrush("YELLOW"); 
        yellowThinBrush2.draw("Hello There Again!!");
        System.out.println("Hashcode: " + yellowThinBrush1.hashCode());
        System.out.println("Hashcode: " + yellowThinBrush2.hashCode());
    }
}
