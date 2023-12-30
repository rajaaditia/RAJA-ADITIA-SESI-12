class BinarySearchInsertionSort {

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

    static void InsertionSort(int[] arr, int size) {
        for (int i = 1; i < size; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
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
        BinarySearchInsertionSort ob = new BinarySearchInsertionSort();
        int[] arr = { 9, 2, 4, 5, 7, 8 };
        int n = arr.length;

        System.out.print("Sebelum di sorted : ");
        printArray(arr, n);

        InsertionSort(arr, n);
        System.out.print("Sesudah di sorted : ");
        printArray(arr, n);

        int x = 5;
        System.out.println("\nMencari angka - " + x);
        int result = ob.binarySearch(arr, x);
        if (result == -1)
            System.out.println("Tidak ada angka " + x + " di array");
        else
            System.out.println("Angka " + x + " ada di index " + result);
    }
}
