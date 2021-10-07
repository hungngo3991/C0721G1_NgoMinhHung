package ss10_dsa_list.bai_tap.arraylist;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    Object elements[];
    int count;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    private void ensureCapacity() {
        if (size >= elements.length) {
            int newSize = elements.length * 2 + 1;
            elements = Arrays.copyOf(elements, newSize);
        }
    }

    public void add(int index, E element) {
        if (index >= 0 && index <= size) {
            size += 1;
            ensureCapacity();
            for (int i = size - 2; i >= index; i--) {
                elements[i + 1] = elements[i];
            }
            elements[index] = element;
            size++;
        }
    }

    public E remove(int index) {
        if (index < 0 || index >= elements.length) {
            throw new IndexOutOfBoundsException("index " + index + " out");
        }
        E element = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return element;
    }

    public int size() {
        return size;
    }

    public int indexOf(E element) {
        for (int i = 0; i < size; i++)
            if (element.equals(elements[i])) {
                return i;
            }
        return -1;
    }

    public boolean contains(E element) {
        return indexOf(element) != -1;
    }


    public void ensureCapacity(int mincapacity) {
        {
            int currentSize = elements.length;

            if (mincapacity > currentSize) {
                E[] newSize = (E[]) new Object[Math.max(currentSize * 2, mincapacity)];
                System.arraycopy(elements, 0, newSize, 0, size);
                elements = newSize;
            }
        }

    }


    public boolean add(E element) {
        count++;
        if (size == elements.length)
            ensureCapacity(size + 1);
        elements[size++] = element;
        return true;
    }

    private void checkBoundExclusive(int index) {

        if (index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: "
                    + size);
    }

    public E get(int index) {
        checkBoundExclusive(index);
        return (E) elements[index];
    }

    public void clear() {
        if (size > 0) {
            count++;
            Arrays.fill(elements, 0, size, null);
            size = 0;
        }
    }


}
