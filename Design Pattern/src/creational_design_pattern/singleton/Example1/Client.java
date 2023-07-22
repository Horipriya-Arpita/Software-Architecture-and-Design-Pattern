package creational_design_pattern.singleton.Example1;

public class Client {
    public static void main(String[] args) {
        Singleton part1 = Singleton.getInstance("Arpita");
        Singleton part2 = Singleton.getInstance("Aruuu");

        System.out.println(part1.name);
        System.out.println(part2.name);
    }
}
