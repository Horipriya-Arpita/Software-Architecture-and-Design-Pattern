package All_Class_Task.SOLID_principles.LSP.Example1.Before_refactoring;

public class Client {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        sparrow.makeSound();
        sparrow.fly();

        System.out.println("");

        Bird penguin = new Penguin();
        penguin.makeSound();
        try {
            penguin.fly();
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
