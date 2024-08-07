public class quickSort {
    
    public static void sort(int[] arr, int start, int end) {
        if (start < end) {
            int p = partition(arr, start, end);
            sort(arr, start, p - 1);
            sort(arr, p + 1, end);
        }
    }
    
    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, end);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {-8,6,997,1,99,89}; // Initialize your array here
        sort(arr, 0, arr.length-1);   // Call sort method passing your array and indexes

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" "); // Print the sorted array
        }
    }
}
