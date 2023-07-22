package structural_design_pattern.bridge.Example1;

public class Client {
    public static void main(String[] args) {
        Color redColor = new RedColor();
        Color blueColor = new BlueColor();

        Shape circleWithRed = new Circle(redColor);
        Shape squareWithBlue = new Square(blueColor);

        circleWithRed.draw();   // Output: Drawing a circle in Red.
        squareWithBlue.draw();  // Output: Drawing a square in Blue.
    }
}
