package behavioral_design_pattern.state.Example2.State;

public class ListeningState implements ConnectionState{
    
    @Override
    public void open() {
        System.out.println("cannot open while in listening state");
    }

    @Override
    public void close() {
        System.out.println("closing the listening connection");
    }

    @Override
    public void listen() {
        System.out.println("connection is already listening");
    }

}
