class BinarySearchSelectionSort {

    int binarySearch(int[] arr, int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == x)
                return m;
            if (arr[m] < x)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }

    public static void selectionSort(int[] arr, int size) {
        for (int i = 0; i < size - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    static void printArray(int[] arr, int size) {
        int i;
        for (i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BinarySearchSelectionSort ob = new BinarySearchSelectionSort();
        int[] arr = {9, 2, 4, 5, 7, 8};
        int n = arr.length;

        System.out.print("Sebelum di sorted : ");
        printArray(arr, n);

        selectionSort(arr, n);
        System.out.print("Sesudah di sorted : ");
        printArray(arr, n);

        int x = 8;
        System.out.println("\nMencari angka - " + x);
        int result = ob.binarySearch(arr, x);
        if (result == -1)
            System.out.println("Tidak ada angka " + x + " di array");
        else
            System.out.println("Angka " + x + " ada di index " + result);
    }
}
