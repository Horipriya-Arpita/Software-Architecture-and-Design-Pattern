package behavioral_design_pattern.memento.Example1;

//caretaker

public class TextEditorHistory {
    
    private TextMemento savedMemento;

    public void saveMemento(TextMemento memento) {
        savedMemento = memento;
    }

    public TextMemento getSavedMemento() {
        return savedMemento;
    }

}
