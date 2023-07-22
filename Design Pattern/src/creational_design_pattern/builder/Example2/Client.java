package creational_design_pattern.builder.Example2;

public class Client {
    public static void main(String[] args) {
        RobotBuilder basicBuilder = new BasicRobotBuilder();
        Director basicDirector = new Director(basicBuilder);

        // Constructing a basic robot
        basicDirector.constructRobot();
        Robot basicRobot = basicBuilder.getRobot();
        System.out.println("Basic Robot: " + basicRobot);

        RobotBuilder complexBuilder = new ComplexRobotBuilder();
        Director complexDirector = new Director(complexBuilder);

        // Constructing a complex robot
        complexDirector.constructRobot();
        Robot complexRobot = complexBuilder.getRobot();
        System.out.println("Complex Robot: " + complexRobot);
    
    }
}
