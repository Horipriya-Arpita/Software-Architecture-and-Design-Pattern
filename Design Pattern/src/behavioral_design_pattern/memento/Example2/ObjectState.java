package behavioral_design_pattern.memento.Example2;

public class ObjectState {
    private double field1;
    private double field2;

    public ObjectState(double field1, double field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public double getField1() {
        return field1;
    }

    public double getField2() {
        return field2;
    }
}
