package ss13_search_algorithm.optional_bai_tap.tim_kiem_nhi_phan_de_quy;

public class BinarySearch {
    public int binarySearch(int[] arr, int left, int right, int value) {
        if (right >= left) {
            int middle = (left + right) / 2;

            if (arr[middle] == value)
                return middle;

            if (arr[middle] < value)
                return binarySearch(arr, middle + 1, right, value);

            return binarySearch(arr, left, middle - 1, value);
        }

        return -1;
    }


    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] arr = {23, 43, 56, 3, 7, 8};
        int n = arr.length;
        int e = 43;
        int result = bs.binarySearch(arr, 0, n - 1, e);
        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index " + result);
    }
}

