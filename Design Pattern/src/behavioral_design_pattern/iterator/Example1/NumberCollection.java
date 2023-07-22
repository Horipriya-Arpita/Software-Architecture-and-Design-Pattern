package behavioral_design_pattern.iterator.Example1;

public class NumberCollection {
    private int[] numbers;

    public NumberCollection(int[] numbers) {
        this.numbers = numbers;
    }

    public Iterator createIterator() {
        return new NumberIterator(numbers);
    }
    
}
