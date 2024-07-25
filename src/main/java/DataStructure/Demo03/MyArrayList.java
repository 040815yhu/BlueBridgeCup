package DataStructure.Demo03;

/**
 * @Author YwaiX
 * @Date 2024/2/19 16:38
 * @Description MyArrayList
 * 用顺序存储(数组)方式来实现列表
 */
public class MyArrayList<E> implements MyList<E> {
    //存放元素的容器
    private Object[] elements;
    //元素个数
    private int size = 0;
    //容器容量
    private int capacity = 10;
    
    public MyArrayList() {
        this.elements = new Object[capacity];
    }
    
    public MyArrayList(int capacity) {
        if (capacity >= 0) {
            this.capacity = capacity;
            this.elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + capacity);
        }
    }
    
    @Override
    public void add(E element) {
        this.expansion();
        elements[size++] = element;
    }
    
    @Override
    public void add(int index, E element) {
        this.expansion();
        if (index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size:" + size);
        }
        if (index < size) {
            for (int i = size; i > index; i--) {
                elements[i] = elements[i - 1];
            }
        }
        elements[index] = element;
        size++;
    }
    
    @Override
    public boolean remove(E element) {
        int index = indexOf(element);
        return remove(index) != null;
    }
    
    @Override
    public E remove(int index) {
        if (index < 0) {
            return null;
        }
        E oldValue = (E) elements[index];
        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return oldValue;
    }
    
    @Override
    public E set(int index, E element) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + size);
        }
        E oldValue = (E) elements[index];
        elements[index] = element;
        return oldValue;
    }
    
    @Override
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }
    
    @Override
    public E get(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + size);
        }
        return (E) elements[index];
    }
    
    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }
    
    @Override
    public int size() {
        return size;
    }
    
    @Override
    public boolean isEmpty() {
        return size == 0;
    }
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            builder.append(elements[i]).append(i == size - 1 ? "" : ",");
        }
        builder.append("]");
        return builder.toString();
    }
    
    
    /**
     * 扩容
     */
    private void expansion() {
        if (size == capacity) {
            capacity *= 2;
            Object[] newArr = new Object[capacity];
            for (int i = 0; i < size; i++) {
                newArr[i] = elements[i];
            }
            elements = newArr;
        }
    }
}
