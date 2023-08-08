package behavioral_design_pattern.state.Example2.State;

public class ClosedState implements ConnectionState{

    @Override
    public void open() {
        System.out.println("opening the closed connection");
    }

    @Override
    public void close() {
        System.out.println("connection is already cosed");
    }

    @Override
    public void listen() {
        System.out.println("cannot listen while in a closed state");
    }
    
}
