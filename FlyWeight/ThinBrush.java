package FlyWeight;
public class ThinBrush implements Brush {
    final BrushSize brushSize = BrushSize.THIN;
    private String color = null;
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public void draw(String content) {
        System.out.println("Drawing ‘" + content + "' in thin color : " + color);
    }
}