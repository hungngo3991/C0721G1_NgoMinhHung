package ss11_dsa_stack_queue.bai_tap.dao_nguoc_phan_tu_mang_so_nguyen_stack;

class Main {
    public static void reverseNumber(int arr[], int n) {

        StackNumber stack = new StackNumber(n);
        for (int i = 0; i < n; i++) {
            stack.push(arr[i]);
        }


        for (int i = 0; i < n; i++) {
            arr[i] = stack.pop();
        }


        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverseString(String arr[], int n) {

        StackString stack = new StackString(n);
        for (int i = 0; i < n; i++) {
            stack.push(arr[i]);
        }


        for (int i = 0; i < n; i++) {
            arr[i] = stack.pop();
        }


        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String args[]) {
        int n1 = 4;
        int[] a1 = new int[]{1, 2, 3, 4};
        reverseNumber(a1, n1);
        System.out.println();
        int n2 = 4;
        String[] a2 = new String[]{"Một", "Hai", "Ba", "Bốn"};
        reverseString(a2, n2);
    }
}
