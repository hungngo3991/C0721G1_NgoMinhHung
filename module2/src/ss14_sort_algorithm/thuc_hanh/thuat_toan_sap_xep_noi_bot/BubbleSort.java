package ss14_sort_algorithm.thuc_hanh.thuat_toan_sap_xep_noi_bot;

public class BubbleSort {

    static int[] list = {-2, 3, 5, 6, 50, 25, 12, 23, 14, 9};

    public static void bubbleSort(int[] list) {
        boolean needSort = true;

        for (int j = 1; j < list.length && needSort; j++) {

            needSort = false;

            for (int i = 0; i < list.length - j; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needSort = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(list);
        for (int e : list) {
            System.out.print(e + " ");
        }
    }

}

