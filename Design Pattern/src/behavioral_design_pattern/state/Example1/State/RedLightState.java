package behavioral_design_pattern.state.Example1.State;

import behavioral_design_pattern.state.Example1.Context.TrafficLight;

public class RedLightState implements TrafficLightState{
    @Override
    public void change(TrafficLight light) {
        System.out.println("Changing light to GREEN.");
        light.setState(new GreenLightState());
    }
}
