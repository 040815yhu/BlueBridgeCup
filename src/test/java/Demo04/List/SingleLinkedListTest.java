package Demo04.List;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author YwaiX
 * @Date 2024/2/22 20:27
 * @Description SingleLinkedListTest
 */
public class SingleLinkedListTest {
    SingleLinkedList list = new SingleLinkedList();
    
    @Test
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
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.delete("e");
        System.out.println(list);
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
    public void at() {
    }
    
    @Test
    public void indexOf() {
    }
}