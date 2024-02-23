package Demo07.List;

import org.junit.Before;
import org.junit.Test;

/**
 * @Author YwaiX
 * @Date 2024/2/23 14:01
 * @Description DoubleLinkListTest
 */
public class DoubleLinkListTest {
    DoubleLinkList<String> list = new DoubleLinkList<>();
    
    @Before
    public void init() {
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
    }
    
    @Test
    public void add() {
        System.out.println(list);
    }
    
    @Test
    public void delete() {
        //list.add("a");
        //list.add("b");
        //list.add("c");
        //list.add("d");
        //list.add("e");
        list.delete("a");
        System.out.println(list);
        list.delete("b");
        System.out.println(list);
    }
    
    @Test
    public void testDelete() {
        //list.add("a");
        //list.add("b");
        //list.add("c");
        //list.add("d");
        //list.add("e");
        list.delete(0);
        System.out.println(list);
        list.delete(0);
        System.out.println(list);
    }
    
    @Test
    public void update() {
        list.update(4, "x");
        System.out.println(list);
        list.update(10, "x");
        System.out.println(list);
    }
    
    @Test
    public void contains() {
        System.out.println(list.contains("a"));
        System.out.println(list.contains("x"));
    }
    
    @Test
    public void at() {
        System.out.println(list.at(4));
        System.out.println(list.at(10));
    }
    
    @Test
    public void indexOf() {
        System.out.println(list.indexOf("e"));
        System.out.println(list.indexOf("x"));
    }
    
    @Test
    public void iter() {
        while (list.hasNext()) {
            Object next = list.next();
            System.out.println(next);
        }
    }
}