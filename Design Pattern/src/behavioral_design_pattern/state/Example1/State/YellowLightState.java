package behavioral_design_pattern.state.Example1.State;

import behavioral_design_pattern.state.Example1.Context.TrafficLight;

public class YellowLightState implements TrafficLightState{
    @Override
    public void change(TrafficLight light) {
        System.out.println("Changing light to RED.");
        light.setState(new RedLightState());
    }
}
