public class InsertionSortExample {

    public static void main(String[] args) {

        int[] arr = { 15, 3, 1, 18, 2 };

        // Insertion Sort
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i]; // pick the current element
            int j = i - 1;

            // shift larger elements to the right
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }

            // insert the element into its correct position
            arr[j + 1] = current;
        }

        // print the sorted array
        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}