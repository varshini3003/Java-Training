package Bridge;
public class Triangle extends Shape{
	public Triangle(Color c) {
		super(c);
	}
	@Override
	public void fillShapeWithColor() {
		System.out.print("Triangle filled with color ");
		color.applyColor();
	} 

}
