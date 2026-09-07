public class insertionsort {

  public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {

    int arr[] = {6, 7, 10, 9, 4, 3, 2, 1};

    // Insertion Sort
    for (int i = 1; i < arr.length; i++) {

      int Current = arr[i];
      int j = i - 1;

      while (j >= 0 && Current < arr[j]) {
        arr[j + 1] = arr[j];
        j--;
      }

      // placement
      arr[j + 1] = Current;
    }

    printArray(arr);
  }
}