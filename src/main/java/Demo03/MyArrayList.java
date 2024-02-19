package Demo03;

import java.util.Arrays;

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
    public void add(Object Element) {
        elements[size++] = elements;
    }

    @Override
    public void delete(Object Element) {

    }

    @Override
    public void delete(int index) {

    }

    @Override
    public void update(int index, Object newElement) {

    }

    @Override
    public boolean contains(Object target) {
        return false;
    }

    @Override
    public Object indexOf(int index) {
        return null;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }
}
