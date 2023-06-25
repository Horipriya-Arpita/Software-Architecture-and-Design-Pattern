/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Builder;

/**
 *
 * @author ASUS
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pizza pizza = new Pizza.PizzaBuilder("larger")
                .cheese(2).onions(3).build();

        System.out.println("Cheese no " + pizza.isCheese());
        System.out.println("Onion no " + pizza.isOnions());
        System.out.println(pizza.isMushrooms());
    }
    
}
