package All_Class_Task.SOLID_principles.LSP.Example1.Before_refactoring;

public class Sparrow extends Bird{

    @Override
    void fly() {
        System.out.println("Sparrow is flying...");
    }

    @Override
    void makeSound() {
        System.out.println("Sparrow is chirping...");
    }
    
}
