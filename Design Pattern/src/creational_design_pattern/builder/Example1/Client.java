package creational_design_pattern.builder.Example1;

public class Client {
    public static void main(String[] args) {
        RobotBuilder builder = new RobotBuilder();
        Director director = new Director(builder);

        // Constructing a robot using the director
        director.constructRobot();

        Robot robot = builder.getRobot();
        System.out.println(robot);
    }
}
