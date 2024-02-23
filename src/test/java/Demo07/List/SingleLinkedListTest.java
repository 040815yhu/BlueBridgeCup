package Demo07.List;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author YwaiX
 * @Date 2024/2/23 15:15
 * @Description SingleLinkedListTest
 */
public class SingleLinkedListTest {
    SingleLinkedList<String> list = new SingleLinkedList<>();
    
    @Test
    @Before
    public void add() {
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println(list);
    }
    
    @Test
    public void delete() {
        //list.add("a");
        //list.add("b");
        //list.add("c");
        //list.add("d");
        //list.add("e");
        list.delete("e");
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
    }
    
    @Test
    public void update() {
        list.update(4,"x");
        System.out.println(list);
        list.update(10,"x");
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
}