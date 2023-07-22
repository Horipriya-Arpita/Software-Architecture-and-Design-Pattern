package creational_design_pattern.builder.Example1;

public class Director {
    private RobotBuilder builder;

    public Director(RobotBuilder builder) {
        this.builder = builder;
    }

    public void constructRobot() {
        builder.buildHead("Metal Head");
        builder.buildBody("Steel Body");
        builder.buildArms("Powerful Arms");
        builder.buildLegs("Agile Legs");
    }
}
