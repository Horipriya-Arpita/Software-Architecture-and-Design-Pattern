package behavioral_design_pattern.memento.Example2;

import java.util.ArrayList;
import java.util.List;

public class UndoManager {
    
    private List<ObjectState> savedStates = new ArrayList<>();
    private MathematicalObject mathematicalObject;

    public UndoManager(MathematicalObject mathematicalObject) {
        this.mathematicalObject = mathematicalObject;
    }

    public void saveState() {
        savedStates.add(mathematicalObject.saveState());
    }

    public void undo() {
        if (!savedStates.isEmpty()) {
            ObjectState state = savedStates.remove(savedStates.size() - 1);
            mathematicalObject.restoreState(state);
        }
    }

    public void undo(int savePoint) {
        if (savePoint >= 0 && savePoint < savedStates.size()) {
            ObjectState state = savedStates.remove(savePoint);
            mathematicalObject.restoreState(state);
        }
    }

    public void undoAll() {
        savedStates.clear();
        mathematicalObject.setFields(0, 0);
    }
    
}
