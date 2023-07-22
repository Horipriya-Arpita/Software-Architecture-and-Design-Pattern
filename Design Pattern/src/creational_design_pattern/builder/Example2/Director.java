package creational_design_pattern.builder.Example2;

public class Director {
    private RobotBuilder builder;

    public Director(RobotBuilder builder) {
        this.builder = builder;
    }

    public void constructRobot() {
        builder.buildHead();
        builder.buildBody();
        builder.buildArms();
        builder.buildLegs();
    }
}
