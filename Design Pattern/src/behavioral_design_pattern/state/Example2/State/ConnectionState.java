package behavioral_design_pattern.state.Example2.State;

public interface ConnectionState {
    void open();
    void close();
    void listen();
}
