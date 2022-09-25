package exerc9;

public class SortMachine {
  private Sort sort;
  private int[] arr;

  public int[] getArr() {
    return arr;
  }

  public SortMachine(int[] arr, Sort selectedSort){
    this.arr = arr;
    this.sort = selectedSort;
  }

  void runSort(){
    this.sort.runSort(arr);
  }
}
