package behavioral_design_pattern.iterator.Example1;

public class NumberIterator implements Iterator{
    private int[] numbers;
    private int position = 0;

    public NumberIterator(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public boolean hasNext() {
        return position < numbers.length;
    }

    @Override
    public int next() {
        if (hasNext()) {
            return numbers[position++];
        }
        throw new IndexOutOfBoundsException("No more numbers in the collection.");
    }
}
