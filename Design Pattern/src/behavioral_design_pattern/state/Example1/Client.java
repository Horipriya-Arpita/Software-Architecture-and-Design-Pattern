package behavioral_design_pattern.state.Example1;

import behavioral_design_pattern.state.Example1.Context.TrafficLight;
import behavioral_design_pattern.state.Example1.State.GreenLightState;


public class Client {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        trafficLight.setState(new GreenLightState());
        trafficLight.change(); // Output: Changing light to GREEN.
        trafficLight.change(); // Output: Changing light to YELLOW.
        trafficLight.change(); // Output: Changing light to RED.
        trafficLight.change(); // Output: Changing light to GREEN.
    }
}
