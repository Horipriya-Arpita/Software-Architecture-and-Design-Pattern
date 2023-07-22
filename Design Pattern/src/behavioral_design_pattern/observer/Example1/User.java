package behavioral_design_pattern.observer.Example1;

public class User implements Observer{
    private String name;

    public User(String name) {
        this.name = name;
    }


    @Override
    public void update(double temperature) {
        System.out.println(name + " received an update: Temperature is " + temperature);
    }
}
