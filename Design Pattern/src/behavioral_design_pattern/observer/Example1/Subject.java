package behavioral_design_pattern.observer.Example1;

public interface Subject {
    // This is called Publisher also
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}
