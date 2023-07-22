package creational_design_pattern.builder.Example1;

public class RobotBuilder {
    private Robot robot;

    public RobotBuilder() {
        this.robot = new Robot();
    }

    public void buildHead(String head) {
        robot.setHead(head);
    }

    public void buildBody(String body) {
        robot.setBody(body);
    }

    public void buildArms(String arms) {
        robot.setArms(arms);
    }

    public void buildLegs(String legs) {
        robot.setLegs(legs);
    }

    public Robot getRobot() {
        return robot;
    }
}
