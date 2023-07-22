package behavioral_design_pattern.memento.Example1;

//originator 

public class TextEditor {

    private String text;

    public void writeText(String text) {
        this.text = text;
    }

    public TextMemento save() {
        return new TextMemento(text);
    }

    public void restore(TextMemento memento) {
        text = memento.getText();
    }

    public String getText() {
        return text;
    }

}
