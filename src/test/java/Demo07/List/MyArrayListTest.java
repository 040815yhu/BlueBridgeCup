package Demo07.List;

import org.junit.Before;
import org.junit.Test;

/**
 * @Author YwaiX
 * @Date 2024/2/23 15:00
 * @Description MyArrayListTest
 */
public class MyArrayListTest {
    private final MyArrayList<String> list = new MyArrayList<>();
    
    @Before
    public void init(){
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
        //list.add(10);
    }
    
    @Test
    public void add() {
        System.out.println(list);
    }
    
    @Test
    public void delete() {
        list.delete("NB7");
        System.out.println(list);
    }
    
    @Test
    public void testDelete() {
        list.delete(8);
        System.out.println(list);
    }
    
    @Test
    public void update() {
        list.update(8,"YwaiX");
        System.out.println(list);
    }
    
    @Test
    public void contains() {
        System.out.println(list.contains("NB7"));
        System.out.println(list.contains("YwaiX"));
    }
    
    @Test
    public void at() {
        System.out.println(list.at(8));
    }
    
    @Test
    public void indexOf() {
        System.out.println(list.indexOf("NB7"));
        System.out.println(list.indexOf("YwaiX"));
    }
    
    @Test
    public void iter() {
        while (list.hasNext()) {
            String next = list.next();
            System.out.println(next);
        }
    }
}