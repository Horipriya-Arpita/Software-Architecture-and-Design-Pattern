package creational_design_pattern.builder.Example2;

public class ComplexRobotBuilder implements RobotBuilder{
    private Robot robot;

    public ComplexRobotBuilder() {
        this.robot = new Robot();
    }

    @Override
    public void buildHead() {
        robot.setHead("Advanced Head with Camera Eye");
    }

    @Override
    public void buildBody() {
        robot.setBody("Advanced Body");
    }

    @Override
    public void buildArms() {
        robot.setArms("Advanced Arms with Extra Functionality");
    }

    @Override
    public void buildLegs() {
        // Complex robot has no legs
        robot.setLegs("No Legs");
    }

    @Override
    public Robot getRobot() {
        return robot;
    }
}
