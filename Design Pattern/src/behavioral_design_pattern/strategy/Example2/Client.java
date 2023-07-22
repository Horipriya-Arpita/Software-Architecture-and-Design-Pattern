package behavioral_design_pattern.strategy.Example2;

import behavioral_design_pattern.strategy.Example2.concrete_strategy.BubbleSort;
import behavioral_design_pattern.strategy.Example2.concrete_strategy.SelectionSort;
import behavioral_design_pattern.strategy.Example2.context.Sorter;

public class Client {
    public static void main(String[] args) {
        int arr[] = {5, 4, 5, 2, 66, 7, 9};

        Sorter sorter = new Sorter();
        sorter.setSortingStrategy(new BubbleSort());
        sorter.sort(arr);

        sorter.setSortingStrategy(new SelectionSort());
        sorter.sort(arr);
    }
}
