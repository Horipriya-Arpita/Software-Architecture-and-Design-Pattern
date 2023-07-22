package creational_design_pattern.builder.Example2;

public interface RobotBuilder {
    void buildHead();
    void buildBody();
    void buildArms();
    void buildLegs();
    Robot getRobot();
}
