package creational_design_pattern.prototype.Example1;

public class Client {
    public static void main(String[] args) {
        
        // Create and use prototype objects
        Animal dog = new Dog("Buddy", "Brown");
        Animal cat = new Cat("Whiskers", "Gray");

        Animal clonedDog = dog.clone();
        Animal clonedCat = cat.clone();

        dog.speak();                // Output: Woof! I'm a Brown dog named Buddy
        clonedDog.speak();          // Output: Woof! I'm a Brown dog named Buddy

        cat.speak();                // Output: Meow! I'm a Gray cat named Whiskers
        clonedCat.speak();          // Output: Meow! I'm a Gray cat named Whiskers
    }
}
