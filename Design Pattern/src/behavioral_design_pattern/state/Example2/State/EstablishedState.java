package behavioral_design_pattern.state.Example2.State;

public class EstablishedState implements ConnectionState{
    
    @Override
    public void open() {
        System.out.println("connection is already established");
    }

    @Override
    public void close() {
        System.out.println("closing the established connection");
    }

    @Override
    public void listen() {
        System.out.println("cannot listen while in established state");
    }
}
