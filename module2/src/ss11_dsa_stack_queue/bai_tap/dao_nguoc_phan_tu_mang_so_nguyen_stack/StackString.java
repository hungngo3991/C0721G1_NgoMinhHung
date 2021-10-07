package ss11_dsa_stack_queue.bai_tap.dao_nguoc_phan_tu_mang_so_nguyen_stack;

class StackString {
    int size;
    int topE;
    String[] a;

    boolean isEmpty() {
        return (topE < 0);
    }

    StackString(int n) {
        topE = -1;
        size = n;
        a = new String[size];
    }

    boolean push(String e) {

        if (topE >= size) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++topE] = e;
            return true;
        }
    }

    String pop() {
        if (topE < 0) {
            System.out.println("Stack Underflow");
            return null;
        } else {
            String e = a[topE--];
            return e;
        }
    }
}
