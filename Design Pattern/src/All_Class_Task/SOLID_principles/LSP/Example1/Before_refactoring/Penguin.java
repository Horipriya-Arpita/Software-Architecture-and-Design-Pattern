package All_Class_Task.SOLID_principles.LSP.Example1.Before_refactoring;

public class Penguin extends Bird{

    @Override
    void fly() {
        //throw new UnsupportedOperationException("Penguin can't fly");
    }

    @Override
    void makeSound() {
        System.out.println("Penguin is making noise...");
    }
    
}
