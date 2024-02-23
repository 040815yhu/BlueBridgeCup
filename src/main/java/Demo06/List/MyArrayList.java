package Demo06.List;

/**
 * @Author YwaiX
 * @Date 2024/2/19 16:38
 * @Description MyArrayList
 * 用顺序存储(数组)方式来实现列表
 */
public class MyArrayList implements MyList {
    private Object[] elements;//真正存储元素的底层结构
    private int size = 0;//元素个数
    private int capacity = 10;//容量
    
    public MyArrayList() {
        elements = new Object[capacity];
    }
    
    public MyArrayList(int capacity) {
        this.capacity = capacity;
        elements = new Object[capacity];
    }
    
    public MyArrayList(Object[] elements, int size, int capacity) {
        this.elements = elements;
        this.size = size;
        this.capacity = capacity;
    }
    
    
    @Override
    public void add(Object element) {
        if (size == capacity) {//扩容
            capacity *= 2;//增加一倍的容量
            Object[] newArr = new Object[capacity];//新建一个数组
            for (int i = 0; i < size; i++) {
                newArr[i] = elements[i];
            }
            elements = newArr;//把旧的那个数组扔掉
        }
        elements[size++] = element;
    }
    
    @Override
    public void delete(Object element) {
        int index = indexOf(element);
        if (index>=0){
            delete(index);
        }
    }
    
    @Override
    public void delete(int index) {
        for (int i = index; i < size; i++) {
            elements[i] = elements[i+1];
        }
        size--;
    }
    
    @Override
    public void update(int index, Object newElement) {
        elements[index] = newElement;
    }
    
    @Override
    public boolean contains(Object target) {
        return indexOf(target) >=0;
    }
    
    @Override
    public Object at(int index) {
        return elements[index];
    }
    
    @Override
    public int indexOf(Object element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i] + (i == size - 1 ? "" : ","));
        }
        sb.append("]");
        return sb.toString();
    }
}
