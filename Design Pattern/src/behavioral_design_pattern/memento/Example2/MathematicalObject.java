package behavioral_design_pattern.memento.Example2;

public class MathematicalObject {
    private double field1;
    private double field2;

    public MathematicalObject(double field1, double field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public void setFields(double field1, double field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public ObjectState saveState() {
        return new ObjectState(field1, field2);
    }

    public void restoreState(ObjectState state) {
        this.field1 = state.getField1();
        this.field2 = state.getField2();
    }

    public double performAddition() {
        return field1 + field2;
    }

    public double performSubtraction() {
        return field1 - field2;
    }

    public double performMultiplication() {
        return field1 * field2;
    }

    public double performDivision() {
        if (field2 != 0) {
            return field1 / field2;
        } else {
            throw new ArithmeticException("Division by zero");
        }
    }

    public void displayFields() {
        System.out.println("Field1: " + field1 + ", Field2: " + field2);
    }
}
