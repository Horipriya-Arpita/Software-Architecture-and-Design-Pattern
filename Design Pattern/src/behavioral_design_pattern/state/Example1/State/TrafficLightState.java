package behavioral_design_pattern.state.Example1.State;

import behavioral_design_pattern.state.Example1.Context.TrafficLight;

public interface TrafficLightState {
    void change(TrafficLight light);
}
