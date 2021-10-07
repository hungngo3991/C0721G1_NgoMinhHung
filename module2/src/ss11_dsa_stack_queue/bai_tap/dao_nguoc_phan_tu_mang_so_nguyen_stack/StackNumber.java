package ss11_dsa_stack_queue.bai_tap.dao_nguoc_phan_tu_mang_so_nguyen_stack;

class StackNumber {
    int size;
    int topE;
    int[] a;

    boolean isEmpty() {
        return (topE < 0);
    }

    StackNumber(int n) {
        topE = -1;
        size = n;
        a = new int[size];
    }

    boolean push(int e) {

        if (topE >= size) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++topE] = e;
            return true;
        }
    }

    int pop() {
        if (topE < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int e = a[topE--];
            return e;
        }
    }
}



