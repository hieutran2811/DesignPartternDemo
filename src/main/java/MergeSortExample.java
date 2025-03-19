public class MergeSortExample {

    // Hàm merge hai mảng con của arr[]
    void merge(int arr[], int left, int mid, int right) {
        // Kích thước hai mảng con
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Tạo mảng tạm
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy dữ liệu vào mảng tạm
        for (int i = 0; i < n1; ++i)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];

        // Merge các mảng tạm vào mảng chính
        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        // Copy các phần tử còn lại của L[], nếu có
        while (i < n1) {
            arr[k++] = L[i++];
        }

        // Copy các phần tử còn lại của R[], nếu có
        while (j < n2) {
            arr[k++] = R[j++];
        }
    }

    // Hàm đệ quy thực hiện MergeSort
    void mergeSort(int arr[], int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            // Sắp xếp hai nửa
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge các mảng con đã sắp xếp
            merge(arr, left, mid, right);
        }
    }

    // In mảng ra màn hình
    static void printArray(int arr[]) {
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Mảng ban đầu:");
        printArray(arr);

        MergeSortExample ob = new MergeSortExample();
        ob.mergeSort(arr, 0, arr.length - 1);

        System.out.println("\nMảng sau khi sắp xếp:");
        printArray(arr);
    }
}
