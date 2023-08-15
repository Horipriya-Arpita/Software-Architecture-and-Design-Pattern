package All_Class_Task.SOLID_principles.OCP.Example1.After_refactoring;

public class Client {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape square = new Square();

        circle.draw();
        square.draw();
    }
}
