package Bridge;

public class BridgeDemo {
    public static void main(String[] args) {
		Shape tri = new Triangle(new RedColor());
		tri.fillShapeWithColor();	
		Shape pent = new Pentagon(new GreenColor());
		pent.fillShapeWithColor();
	}
}
