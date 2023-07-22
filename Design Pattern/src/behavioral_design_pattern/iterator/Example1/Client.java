package behavioral_design_pattern.iterator.Example1;

public class Client {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 };

        // Create the collection (NumberCollection)
        NumberCollection numberCollection = new NumberCollection(numbers);

        // Create the iterator (NumberIterator)
        Iterator iterator = numberCollection.createIterator();

        // Traverse and print the numbers
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
