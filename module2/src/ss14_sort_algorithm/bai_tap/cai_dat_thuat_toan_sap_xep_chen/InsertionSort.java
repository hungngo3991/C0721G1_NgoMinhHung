package ss14_sort_algorithm.bai_tap.cai_dat_thuat_toan_sap_xep_chen;

public class InsertionSort {

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int j;
            int x = list[i];
            for (j = i - 1; j >= 0 && list[j] > x; j--) {
                list[j + 1] = list[j];
            }

            list[j + 1] = x;

        }
    }

    public static void main(String[] args) {
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        insertionSort(list);
        for (int e : list) {
            System.out.print(e + " ");
        }
    }
}

