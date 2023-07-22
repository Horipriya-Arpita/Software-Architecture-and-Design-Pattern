package behavioral_design_pattern.memento.Example1;

public class Client {
    public static void main(String[] args) {
        
        // Create the originator (TextEditor) and caretaker (TextEditorHistory)
        TextEditor textEditor = new TextEditor();
        TextEditorHistory history = new TextEditorHistory();

        // Write and save the initial text
        textEditor.writeText("Hello, this is the initial text.");
        history.saveMemento(textEditor.save());

        // Continue editing and saving new states
        textEditor.writeText("Hello, this is a modified text.");
        history.saveMemento(textEditor.save());

        // Restore to the initial state
        textEditor.restore(history.getSavedMemento());

        // Print the current text
        System.out.println("Current Text: " + textEditor.getText()); // Output: Current Text: Hello, this is the initial text.
    
    }
}
