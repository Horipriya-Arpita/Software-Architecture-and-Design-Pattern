package All_Class_Task.SOLID_principles.OCP.Example1.Before_refactoring;

public class Shape {
    private String type;

    public Shape(String type) {
        this.type = type;
    }

    public void draw() {
        if (type.equals("circle")) {
            drawCircle();
        } else if (type.equals("square")) {
            drawSquare();
        }
        // More else-if blocks for other shapes...
    }

    private void drawCircle() {
        // Code to draw a circle
        System.out.println("Drawing a circle");
    }

    private void drawSquare() {
        // Code to draw a square
        System.out.println("Drawing a square");
    }
}
