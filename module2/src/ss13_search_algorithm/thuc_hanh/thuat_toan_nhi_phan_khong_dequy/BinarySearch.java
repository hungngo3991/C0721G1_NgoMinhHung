package ss13_search_algorithm.thuc_hanh.thuat_toan_nhi_phan_khong_dequy;

public class BinarySearch {
    public static int[] list = {3, 5, 8, 11, 13, 47, 52, 63, 68, 72, 78};

    public static int binarySearch(int[] list, int value) {
        int left = 0;
        int right = list.length - 1;
        while (right >= left) {
            int mid = (left + right) / 2;
            if (value < list[mid])
                right = mid - 1;
            else if (value == list[mid])
                return mid;
            else
                left = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list, 3));
        System.out.println(binarySearch(list, 13));
        System.out.println(binarySearch(list, 72));
        System.out.println(binarySearch(list, 1));
        System.out.println(binarySearch(list, 4));
        System.out.println(binarySearch(list, 80));
    }
}
