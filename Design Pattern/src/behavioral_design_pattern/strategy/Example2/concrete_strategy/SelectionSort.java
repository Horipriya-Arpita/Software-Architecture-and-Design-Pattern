package behavioral_design_pattern.strategy.Example2.concrete_strategy;

public class SelectionSort implements SortingStrategy{
    @Override
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }

        System.out.println("Selection Sorting\n ");
        
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i] + " -> ");
        }
    }
}
