package DataStructure.Demo08;

import java.util.*;

/**
 * @Author YwaiX
 * @Date 2024/2/23 20:00
 * @Description ListDemo
 */
public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list = new LinkedList<>();
        list.add("qwe");
        list.add("asd");
        list.add("zxc");
        list.remove("");
        
        Collections.sort(list);
        
        System.out.println(list);
        
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("qwe",10));
        studentList.add(new Student("asd",20));
        studentList.add(new Student("zxc",30));
        
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getAge() - o1.getAge();
            }
        });
        
        System.out.println(studentList);
        
        Iterator<Student> iterator = studentList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
