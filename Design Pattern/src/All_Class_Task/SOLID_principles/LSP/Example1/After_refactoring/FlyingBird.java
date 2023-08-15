package All_Class_Task.SOLID_principles.LSP.Example1.After_refactoring;

public abstract class FlyingBird extends Bird{

    @Override
    void makeSound() {
        System.out.println("Making Sound");
    }
    
    public void fly(){
        System.out.println("Flying");
    }
}
