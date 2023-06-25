/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

public class Pizza {
    private final String size;
    private final int cheese;
    private final int pepperoni;
    private final boolean mushrooms;
    private final int onions;

    private Pizza(PizzaBuilder builder) {
        this.size = builder.size;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.mushrooms = builder.mushrooms;
        this.onions = builder.onions;
    }

    // getters for all fields


    public String getSize() {
        return size;
    }

    public int isCheese() {
        return cheese;
    }

    public int isPepperoni() {
        return pepperoni;
    }

    public boolean isMushrooms() {
        return mushrooms;
    }

    public int isOnions() {
        return onions;
    }

    public static class PizzaBuilder {
        private final String size;
        private int cheese;
        private int pepperoni;
        private boolean mushrooms;
        private int onions;

        public PizzaBuilder(String size) {
            this.size = size;
        }

        public PizzaBuilder cheese(int cheese) {
            this.cheese = cheese;
            return this;
        }

        public PizzaBuilder pepperoni(int pepperoni) {
            this.pepperoni = pepperoni;
            return this;
        }

        public PizzaBuilder mushrooms(boolean mushrooms) {
            this.mushrooms = mushrooms;
            return this;
        }

        public PizzaBuilder onions(int onions) {
            this.onions = onions;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}