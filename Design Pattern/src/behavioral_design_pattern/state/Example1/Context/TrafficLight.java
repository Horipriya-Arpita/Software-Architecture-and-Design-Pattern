package behavioral_design_pattern.state.Example1.Context;

import behavioral_design_pattern.state.Example1.State.TrafficLightState;

public class TrafficLight {
    private TrafficLightState state;

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public void change() {
        state.change(this);
    }
}
