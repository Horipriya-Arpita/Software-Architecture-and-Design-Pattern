package behavioral_design_pattern.state.Example2.Context;

import behavioral_design_pattern.state.Example2.State.ClosedState;
import behavioral_design_pattern.state.Example2.State.ConnectionState;

public class TCPConnection {
    private ConnectionState state;

    public TCPConnection(){
        state = new ClosedState();
    }

    public void setState(ConnectionState state){
        this.state = state;
    }

    public void open(){
        state.open();
    }

    public void close(){
        state.close();
    }

    public void listen(){
        state.listen();
    }
}
