package Demo03;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author YwaiX
 * @Date 2024/2/19 17:42
 * @Description MyArrayListTest
 */
public class MyArrayListTest {

    @Test
    public void add() {
        MyArrayList list = new MyArrayList();
        list.add("nike");
        list.add("adidas");
        list.add("NB");
        System.out.println(list);
    }

    @Test
    public void delete() {
    }

    @Test
    public void testDelete() {
    }

    @Test
    public void update() {
    }

    @Test
    public void contains() {
    }

    @Test
    public void indexOf() {
    }
}