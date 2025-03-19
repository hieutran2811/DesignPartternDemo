public class InsertionSortExample {

    // Hàm thực hiện thuật toán Insertion Sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Dịch chuyển các phần tử của dãy đã sắp xếp để chèn key vào đúng vị trí
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // In mảng ra màn hình
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Chạy ví dụ
    public static void main(String[] args) {
        int[] arr = {9, 5, 1, 4, 3};

        System.out.println("Mảng ban đầu:");
        printArray(arr);

        insertionSort(arr);

        System.out.println("\nMảng sau khi sắp xếp (tăng dần):");
        printArray(arr);
    }
}
