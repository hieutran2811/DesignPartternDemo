public class CountingSortExample {

    public static void countingSort(int[] arr) {
        int n = arr.length;

        // Tìm giá trị lớn nhất trong mảng
        int max = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > max)
                max = arr[i];

        int[] count = new int[max + 1];
        int[] output = new int[n];

        // Đếm số lần xuất hiện của mỗi phần tử
        for (int i = 0; i < n; i++)
            count[arr[i]]++;

        // Cộng dồn các phần tử trong count[]
        for (int i = 1; i <= max; i++)
            count[i] += count[i - 1];

        // Xây dựng mảng output[]
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // Copy mảng output vào arr[]
        for (int i = 0; i < n; i++)
            arr[i] = output[i];
    }

    // Hàm in mảng
    static void printArray(int[] arr) {
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }

    // Hàm main
    public static void main(String args[]) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};

        System.out.println("Mảng ban đầu:");
        printArray(arr);

        countingSort(arr);

        System.out.println("\nMảng sau khi sắp xếp:");
        printArray(arr);
    }
}
