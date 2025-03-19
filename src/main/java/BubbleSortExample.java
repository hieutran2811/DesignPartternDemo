public class BubbleSortExample {
    // Hàm thực hiện thuật toán Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        // Lặp qua tất cả các phần tử
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Duyệt mảng, mỗi lần duyệt sẽ đưa được phần tử lớn nhất về cuối
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Hoán đổi arr[j] và arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // Nếu không có hoán đổi nào thì mảng đã sắp xếp
            if (!swapped) break;
        }
    }

    // Hàm main chạy thử thuật toán
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};

        System.out.println("Mảng ban đầu:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("\nMảng sau khi sắp xếp (tăng dần):");
        printArray(arr);
    }

    // Hàm hỗ trợ in mảng ra màn hình
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
