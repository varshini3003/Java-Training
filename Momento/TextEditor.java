package Momento;
public class TextEditor 
{
    private TextWindow textWindow;
    private TextWindowState textWindowState;
    public TextEditor(TextWindow textWindow) {
        this.textWindow = textWindow;
    }
    public void write(String text) {
        textWindow.addText(text);
    }

    public String print() {
        return textWindow.getCurrentText();
    }
    public void hitSave() {
        textWindowState = textWindow.save();
    }

    public void hitUndo() {
        textWindow.restore(textWindowState);
    }
}