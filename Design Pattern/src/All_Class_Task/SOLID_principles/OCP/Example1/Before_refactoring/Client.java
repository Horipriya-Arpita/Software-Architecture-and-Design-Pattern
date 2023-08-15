package All_Class_Task.SOLID_principles.OCP.Example1.Before_refactoring;

public class Client {
    public static void main(String[] args) {
        Shape circle = new Shape("circle");
        Shape square = new Shape("square");

        circle.draw();
        square.draw();
    }
}
