public class QuickSortExample {

    // Hàm phân hoạch mảng và đặt pivot đúng vị trí
    static int partition(int arr[], int left, int right) {
        int pivot = arr[right]; // chọn pivot là phần tử cuối cùng
        int i = (left - 1); // chỉ số của phần tử nhỏ hơn pivot

        for (int j = left; j <= right - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                // Hoán đổi arr[i] và arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Đưa pivot về vị trí chính xác (i+1)
        int temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;

        return (i + 1);
    }

    // Hàm QuickSort chính
    static void quickSort(int arr[], int left, int right) {
        if (left < right) {
            // pi là chỉ số nơi pivot được đặt đúng chỗ
            int pi = partition(arr, left, right);

            // Đệ quy sắp xếp 2 nửa
            quickSort(arr, left, pi - 1);
            quickSort(arr, pi + 1, right);
        }
    }

    // Hàm in mảng
    static void printArray(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5, 3, 8, 4, 2};

        System.out.println("Mảng ban đầu:");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("\nMảng sau khi sắp xếp (tăng dần):");
        printArray(arr);
    }
}
