package Momento;

public class MomentoDemo {
    public static void main(String[] args) 
    {
        TextEditor textEditor = new TextEditor(new TextWindow());
        textEditor.write("Memento Design Pattern\n");;
        textEditor.write("Learning...\n");
        textEditor.hitSave();        
        textEditor.write("Testing Undo and Redo text...\n");    
        System.out.println(textEditor.print());
        textEditor.hitUndo();
        System.out.println(textEditor.print());
    }
}
