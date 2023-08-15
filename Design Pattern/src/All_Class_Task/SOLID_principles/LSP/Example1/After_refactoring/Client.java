package All_Class_Task.SOLID_principles.LSP.Example1.After_refactoring;

public class Client {
    public static void main(String[] args) {
        FlyingBird sparrow = new Sparrow();
        sparrow.makeSound();
        sparrow.fly();

        System.out.println("");

        Bird penguin = new Penguin();
        penguin.makeSound();
        
    }
}
