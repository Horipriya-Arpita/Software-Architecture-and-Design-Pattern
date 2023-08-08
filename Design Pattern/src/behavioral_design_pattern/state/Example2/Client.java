package behavioral_design_pattern.state.Example2;

import behavioral_design_pattern.state.Example2.Context.TCPConnection;
import behavioral_design_pattern.state.Example2.State.EstablishedState;

public class Client {
    public static void main(String[] args) {
        TCPConnection connection = new TCPConnection();
        connection.open();
        connection.listen();
        connection.close();

        connection.setState(new EstablishedState());

        connection.open();
        connection.listen();
        connection.close();
    }
}
