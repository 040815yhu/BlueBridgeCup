package Demo03;

import org.junit.Test;

/**
 * @Author YwaiX
 * @Date 2024/2/19 17:42
 * @Description MyArrayListTest
 */
public class MyArrayListTest {
    private final MyList list = new MyArrayList();

    @Test
    public void add() {
        list.add("nike");
        list.add("adidas");
        list.add("NB1");
        list.add("NB2");
        list.add("NB3");
        list.add("NB4");
        list.add("NB5");
        list.add("NB6");
        list.add("NB7");
        list.add("NB8");
        list.add("NB9");
        list.add("NB10");
        System.out.println(list);
    }

    @Test
    public void delete() {
        list.add("nike");
        list.add("adidas");
        list.add("NB1");
        list.add("NB2");
        list.add("NB3");
        list.add("NB4");
        list.add("NB5");
        list.add("NB6");
        list.add("NB7");
        list.add("NB8");
        list.add("NB9");
        list.add("NB10");
        list.delete("NB7");
        System.out.println(list);
    }

    @Test
    public void testDelete() {
        list.add("nike");
        list.add("adidas");
        list.add("NB1");
        list.add("NB2");
        list.add("NB3");
        list.add("NB4");
        list.add("NB5");
        list.add("NB6");
        list.add("NB7");
        list.add("NB8");
        list.add("NB9");
        list.add("NB10");
        list.delete(8);
        System.out.println(list);
    }

    @Test
    public void update() {
        list.add("nike");
        list.add("adidas");
        list.add("NB1");
        list.add("NB2");
        list.add("NB3");
        list.add("NB4");
        list.add("NB5");
        list.add("NB6");
        list.add("NB7");
        list.add("NB8");
        list.add("NB9");
        list.add("NB10");
        list.update(8,"YwaiX");
        System.out.println(list);
    }

    @Test
    public void contains() {
        list.add("nike");
        list.add("adidas");
        list.add("NB1");
        list.add("NB2");
        list.add("NB3");
        list.add("NB4");
        list.add("NB5");
        list.add("NB6");
        list.add("NB7");
        list.add("NB8");
        list.add("NB9");
        list.add("NB10");
        System.out.println(list.contains("NB7"));
        System.out.println(list.contains("YwaiX"));
    }
    
    @Test
    public void at() {
        list.add("nike");
        list.add("adidas");
        list.add("NB1");
        list.add("NB2");
        list.add("NB3");
        list.add("NB4");
        list.add("NB5");
        list.add("NB6");
        list.add("NB7");
        list.add("NB8");
        list.add("NB9");
        list.add("NB10");
        System.out.println(list.at(8));
    }

    @Test
    public void indexOf() {
        list.add("nike");
        list.add("adidas");
        list.add("NB1");
        list.add("NB2");
        list.add("NB3");
        list.add("NB4");
        list.add("NB5");
        list.add("NB6");
        list.add("NB7");
        list.add("NB8");
        list.add("NB9");
        list.add("NB10");
        System.out.println(list.indexOf("NB7"));
        System.out.println(list.indexOf("YwaiX"));
    }
}