package behavioral_design_pattern.memento.Example2;

public class Client {
    public static void main(String[] args) {
        MathematicalObject mathematicalObject = new MathematicalObject(10, 5);
        UndoManager undoManager = new UndoManager(mathematicalObject);

        mathematicalObject.displayFields(); // Initial state: Field1: 10.0, Field2: 5.0

        undoManager.saveState();

        mathematicalObject.setFields(20, 7);
        mathematicalObject.displayFields(); // Field1: 20.0, Field2: 7.0

        undoManager.saveState();

        double result = mathematicalObject.performAddition();
        System.out.println("Addition Result: " + result);

        undoManager.undo();
        mathematicalObject.displayFields(); // Restored to previous state: Field1: 10.0, Field2: 5.0

        undoManager.undoAll();
        mathematicalObject.displayFields(); // Restored to initial state: Field1: 0.0, Field2: 0.0
    
    }
}
