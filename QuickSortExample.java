import java.util.Scanner;

public class QuickSortExample {

  // Quick Sort function
  public static void quickSort(int[] arr, int low, int high) {
    if (low < high) {

      // Partition index
      int pi = partition(arr, low, high);

      // Recursively sort elements before and after partition
      quickSort(arr, low, pi - 1);
      quickSort(arr, pi + 1, high);
    }
  }

  // Partition function
  public static int partition(int[] arr, int low, int high) {
    int pivot = arr[high]; // choose last element as pivot
    int i = low - 1;

    for (int j = low; j < high; j++) {
      if (arr[j] < pivot) {
        i++;

        // swap arr[i] and arr[j]
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }

    // place pivot in correct position
    int temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;

    return i + 1;
  }

  public static void main(String[] args) {

    // Input
    int[] arr = { 13, 2, 8, 9, 1, 4 };

    // Call quick sort
    quickSort(arr, 0, arr.length - 1);

    // Output
    System.out.println("Quick Sort Output:");
    for (int num : arr) {
      System.out.print(num + " ");
    }
  }
}