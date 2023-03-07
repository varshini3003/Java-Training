package Momento;

public class TextWindow 
{
  private StringBuilder currentText;

  public TextWindow() {
      this.currentText = new StringBuilder();
  }
  public String getCurrentText() {
    return currentText.toString();
  }
  public void addText(String text) {
      currentText.append(text);
  }

  public TextWindowState save() {
      return new TextWindowState(currentText.toString());
  }

  public void restore(TextWindowState curState) {
      currentText = new StringBuilder(curState.getText());
  }
}
