package exerc9;

public class Program {
  public static void main(String[] args){
    int[] arr = {-9, 11, 19, -1, 0, -3, 5, 9, 3};
    MergeSort mergeSort = new MergeSort();
    QuickSort quickSort = new QuickSort();
    SortMachine sortMachine = new SortMachine(arr, quickSort);
    sortMachine.runSort();

    for (int element : sortMachine.getArr()){
        System.out.println(element);
    }
  }
}
