package behavioral_design_pattern.strategy.Example2.context;

import behavioral_design_pattern.strategy.Example2.concrete_strategy.SortingStrategy;

public class Sorter {
    private SortingStrategy sortingStrategy;

    public void setSortingStrategy(SortingStrategy sortingStrategy){
        this.sortingStrategy = sortingStrategy;
    }

    public void sort(int arr[]){
        sortingStrategy.sort(arr);
    }
}
