public class SelectionSortExample {

    // Hàm sắp xếp chọn (Selection Sort)
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Di chuyển ranh giới giữa phần tử đã sắp xếp và chưa sắp xếp
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i; // Giả định phần tử hiện tại là nhỏ nhất

            // Tìm phần tử nhỏ nhất trong phần chưa sắp xếp
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            // Hoán đổi phần tử nhỏ nhất với phần tử đầu tiên của vùng chưa sắp xếp
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    // Hàm in mảng
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Mảng ban đầu:");
        printArray(arr);

        selectionSort(arr);

        System.out.println("\nMảng sau khi sắp xếp (tăng dần):");
        printArray(arr);
    }
}
