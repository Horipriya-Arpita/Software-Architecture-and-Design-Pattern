package creational_design_pattern.builder.Example2;

public class BasicRobotBuilder implements RobotBuilder{
    private Robot robot;

    public BasicRobotBuilder() {
        this.robot = new Robot();
    }

    @Override
    public void buildHead() {
        robot.setHead("Basic Head");
    }

    @Override
    public void buildBody() {
        robot.setBody("Basic Body");
    }

    @Override
    public void buildArms() {
        robot.setArms("Basic Arms");
    }

    @Override
    public void buildLegs() {
        robot.setLegs("Basic Legs");
    }

    @Override
    public Robot getRobot() {
        return robot;
    }
}
