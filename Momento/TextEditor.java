package Momento;
public class TextEditor 
{
    private TextWindow textWindow;

    public TextEditor(TextWindow textWindow) {
        this.textWindow = textWindow;
    }
    private TextWindowState savedTextWindow;
    public void write(String text) {
        textWindow.addText(text);
    }

    public String print() {
        return textWindow.getCurrentText();
    }
    public void hitSave() {
        savedTextWindow = textWindow.save();
    }

    public void hitUndo() {
        textWindow.restore(savedTextWindow);
    }
}