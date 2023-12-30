class BinarySearchBubbleSort {

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

    static void bubbleSort(int[] arr, int n) {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
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
        BinarySearchBubbleSort ob = new BinarySearchBubbleSort();
        int[] arr = { 9, 2, 4, 5, 7, 8 };
        int n = arr.length;

        System.out.print("Sebelum di sorted : ");
        printArray(arr, n);

        bubbleSort(arr, n);
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
